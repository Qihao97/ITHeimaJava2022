package section_03_api_basic.StringAndTimeFormat;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Qihao
 * @Time: 2022/2022/11/4/21:48
 * @Descriptions:案例一用户登录的实现
 */
public class UserLoginRealization {
    public static void main(String[] args) {
        //        创建窗体对象
        JFrame jf = new JFrame("用户登录");

        jf.setVisible(true);
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //        用户名
        JLabel userName = new JLabel("UserName:");
        userName.setBounds(50, 50, 50, 20);
        jf.add(userName);

        JTextField userNameTextField = new JTextField();
        userNameTextField.setBounds(150, 50, 180, 20);
        jf.add(userNameTextField);

//        密码
        JLabel passWord = new JLabel("PassWord:");
        passWord.setBounds(50, 100, 50, 20);
        jf.add(passWord);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 180, 20);
        jf.add(passwordField);

//        登录按钮
        JButton login = new JButton("Login");
        login.setBounds(50, 200, 280, 20);
        jf.add(login);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userNameTextField.getText();
                String password = passwordField.getText();

//              验证用户名长度
                if (username.length() < 6 || username.length() > 12){
                    JOptionPane.showMessageDialog(jf, "用户名长度在6-12之间，请重新输入！");
                    userNameTextField.setText("");
                    return;
                }

//                验证密码长度
                if (password.length() < 6 || password.length() > 12){
                    JOptionPane.showMessageDialog(jf, "密码的长度在6-12之间，请重新输入！");
                    passwordField.setText("");
                    return;
                }

//                判断用户名密码内容是否正确
                if ("itheima".equals(username) && "123456".equals(password)){
                    JOptionPane.showMessageDialog(jf, "登录成功！");
                    userNameTextField.setText("");
                    passwordField.setText("");
//                    return;
                }else {
                    JOptionPane.showMessageDialog(jf, "用户名或者密码错误！");
                    userNameTextField.setText("");
                    passwordField.setText("");
//                    return;
                }
            }
        });
    }
}
