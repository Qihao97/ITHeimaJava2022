package paragraph11.demo11_7;

import java.io.*;//引入网络包，以实现套接字连接
import java.net.*;//引入输入输出流包，以进行数据的读写
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @Author: Qihao
 * @Time: 2023/10/25 14:57
 * @Descriptions: 程序11.7
 */
public class ChatClient extends JFrame implements ActionListener {
    private JTextField inputMsgBox; //inputMsgBox用于信息输入
    private JTextArea dispalyArea; //dispalyArea用于信息显示
    private JButton sendMsg; // sendMsg用于创建发送按钮
    private ObjectOutputStream outputS;//outputS用于建立输出流
    private ObjectInputStream inputS; //inputS用于建立输入流
    private String serverIP; // serverIP用于指示服务器端IP地址
    private Socket socket;  //socket用于与服务器端建立套接字连接

    public ChatClient(String connectIP) {
        super("聊天客户端");
        serverIP = connectIP;
        Container container = getContentPane();
        inputMsgBox = new JTextField("", 18);
        inputMsgBox.setEnabled(false);
        sendMsg = new JButton("发送");
        sendMsg.addActionListener(this);
        inputMsgBox.addActionListener(this);
        JPanel p = new JPanel(new FlowLayout());
        p.add(inputMsgBox);
        p.add(sendMsg);
        container.add(p, BorderLayout.SOUTH);
        dispalyArea = new JTextArea();
        container.add(new JScrollPane(dispalyArea), BorderLayout.CENTER);
        this.setSize(280, 320);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        sendMsg(inputMsgBox.getText().trim());
        inputMsgBox.setText("");
    }

    public void connect() {
        try {
            setupConnection();
            communication();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                closeConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void setupConnection() throws IOException {
        inputMsgBox.setEnabled(false);
        dispalyArea.setText("\n连接中......");
        InetAddress ip = InetAddress.getByName(serverIP);  //获取服务器的IP地址
        socket = new Socket(ip, 5000); //建立与服务器端口5000的套接字
    }

    private void communication() throws IOException {  //建立套接字的输入输出流,进行通信
        outputS = new ObjectOutputStream(socket.getOutputStream());
        outputS.flush();
        inputS = new ObjectInputStream(socket.getInputStream());
        String s = "\n与客户端连接成功";
        outputS.writeObject(s);
        outputS.flush();
        inputMsgBox.setEnabled(true);
        do {
            try {
                s = (String) inputS.readObject();
                dispalyArea.append(s);
            } catch (ClassNotFoundException e) {
                dispalyArea.append("\n unknown object type received");
            }
        } while (!s.equals("\n服务器端:Terminate"));
    }

    private void closeConnection() throws IOException { //关闭套接字

        dispalyArea.append("\n连接关闭");
        inputMsgBox.setEnabled(false);
        outputS.close();
        inputS.close();
        socket.close();
    }

    private void sendMsg(String s) {
        try {
            outputS.writeObject("\n客户端:" + s);
            outputS.flush();
            dispalyArea.append("\n客户端:" + s);
        } catch (IOException e) {
            dispalyArea.append("\n 与服务器已断开连接");
        }
    }

    public static void main(String args[]) {
        ChatClient chat;
        if (args.length == 0)
            chat = new ChatClient("127.0.0.1");
        else
            chat = new ChatClient(args[0].trim());
        chat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chat.connect();
    }
}
