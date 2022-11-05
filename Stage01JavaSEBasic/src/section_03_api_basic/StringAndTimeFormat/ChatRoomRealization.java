package section_03_api_basic.StringAndTimeFormat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Qihao
 * @Time: 2022/2022/11/4/23:53
 * @Descriptions:案例二，聊天室功能实现
 * 要求：
 *    1.把文本框中的内容发送到文本域中；
 *    2.文本框中内容前后的空格要删掉；
 *    3.文本框中的内容以追加的方式显示在文本域中；
 *    4.点击清空按钮后，文本域中的内容为空。
 */
public class ChatRoomRealization {
    public static void main(String[] args) {
        //        创建窗体对象
        JFrame jf = new JFrame("聊天窗口");

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

//        发送消息的实现
        send_message.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = messageTextField.getText().trim();
//                messageArea.setText(message);
                messageArea.append(message + '\n');
                messageTextField.setText("");
            }
        });

//        清空消息按钮
        JButton clean_screen = new JButton("Clean Screen");
        clean_screen.setBounds(280, 230, 100, 20);
        jf.add(clean_screen);

//        清空消息按钮的实现
        clean_screen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageArea.setText("");
            }
        });

    }
}
