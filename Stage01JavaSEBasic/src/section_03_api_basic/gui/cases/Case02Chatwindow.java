package section_03_api_basic.gui.cases;

import javax.swing.*;

/**
 * @Author: Qihao
 * @Time: 2022/2022/11/4/2:19
 * @Descriptions:聊天室案例
 */
public class Case02Chatwindow {
    public static void main(String[] args) {
        //        创建窗体对象
        JFrame jf = new JFrame("聊天室");

        jf.setVisible(true);
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

//        显示聊天信息的文本域
        JTextArea messageArea = new JTextArea();
        messageArea.setBounds(10, 10, 360, 200);
        jf.add(messageArea);

//        输入信息框
        JTextField messageTextField = new JTextField();
        messageTextField.setBounds(10, 230, 180, 20);
        jf.add(messageTextField);

//        发送信息按钮
        JButton send_message = new JButton("Send Message");
        send_message.setBounds(200, 230, 70, 20);
        jf.add(send_message);

//        清空消息按钮
        JButton clean_screen = new JButton("Clean Screen");
        clean_screen.setBounds(280, 230, 100, 20);
        jf.add(clean_screen);

    }
}
