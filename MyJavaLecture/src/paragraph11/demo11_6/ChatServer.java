package paragraph11.demo11_6;

import java.io.*;   //引入输入输出流包，以进行数据的读写
import java.net.*;   //引入网络包，以实现套接字连接
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @Author: Qihao
 * @Time: 2023/10/25 14:56
 * @Descriptions: 程序11.6
 */
public class ChatServer extends JFrame implements ActionListener {
    private JTextField inputMsgBox;  //inputMsgBox用于信息输入
    private JTextArea dispalyArea;   //dispalyArea用于信息显示
    private JButton sendMsg;  // sendMsg用于创建发送按钮
    private ObjectInputStream inputS;     //inputS用于建立输入流
    private ObjectOutputStream outputS;    //outputS用于建立输出流
    private ServerSocket server;   // server用于建立服务器套接字
    private Socket socket;   //socket用于与客户端建立套接字连接

    public ChatServer() {
        super("聊天服务器端");
        Container container = getContentPane();
        inputMsgBox = new JTextField("", 18);
        inputMsgBox.setEnabled(false);
        inputMsgBox.addActionListener(this);
        sendMsg = new JButton("发送");
        sendMsg.addActionListener(this);
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
        sendMsg(inputMsgBox.getText().trim());//发送消息
        inputMsgBox.setText("");
    }

    public void connect() {
        try {
            server = new ServerSocket(5000);  //①打开服务器端口5000
            setupConnection();  //建立连接
            communication();  //通信
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

    private void setupConnection() throws IOException {  //②与客户端建立连接
        dispalyArea.setText("\n等待连接......");
        socket = server.accept();
        dispalyArea.append("\n与" + socket.getInetAddress().getHostName() + "客户建立连接");
    }

    private void communication() throws IOException {//③建立套接字的输入输出流,进行通信
        outputS = new ObjectOutputStream(socket.getOutputStream());
        outputS.flush();
        inputS = new ObjectInputStream(socket.getInputStream());
        String s = "\n与服务器端连接成功";
        outputS.writeObject(s);
        outputS.flush();
        inputMsgBox.setEnabled(true);
        sendMsg.setEnabled(true);
        do {
            try {
                s = (String) inputS.readObject();
                dispalyArea.append(s);
            } catch (ClassNotFoundException e) {
                dispalyArea.append("\n Unknown object bype received");
            }
        } while (!s.equals("\n客户端:Terminate"));
    }

    private void closeConnection() throws IOException {  //④关闭套接字
        dispalyArea.append("\n连接关闭");
        inputMsgBox.setEnabled(false);
        sendMsg.setEnabled(false);
        outputS.close();
        inputS.close();
        socket.close();
    }

    private void sendMsg(String s) {     //⑤发送消息
        try {
            outputS.writeObject("\n服务器端:" + s);
            outputS.flush();
            dispalyArea.append("\n服务器端:" + s);
        } catch (IOException e) {
            dispalyArea.append("\n 与客户端已断开连接");
        }
    }

    public static void main(String args[]) {
        ChatServer chat = new ChatServer();
        chat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chat.connect();
    }
}

