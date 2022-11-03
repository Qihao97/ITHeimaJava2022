package section_03_api_basic.gui.cases;

import javax.swing.*;

/**
 * @Author: Qihao
 * @Time: 2022/2022/11/4/1:23
 * @Descriptions:用户登录示例
 */
public class Case01UserLogin {
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

    }
}
