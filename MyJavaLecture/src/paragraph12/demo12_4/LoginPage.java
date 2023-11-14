package paragraph12.demo12_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: Qihao
 * @Time: 11/14/2023 7:39 PM
 * @Descriptions: 登录页面
 */
public class LoginPage extends JFrame implements ActionListener {
    private JTextField jtfUser; //用户名
    private JPasswordField jpfPwd; //密码
    private JButton jbSend; //发送
    private JButton jbCancel; //退出
    private Container c;

    private String user = null; //用于保存用户名
    private String pwd = null; //用于保存密码

    LoginPage() {
        setTitle("登录");

        // 获取屏幕的尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setSize(300, 200);
        int width = getWidth();
        int height = getHeight();
        //窗口居中
        setLocation((screenWidth - width) / 2, (screenHeight - height) / 2);

        c = getContentPane(); //初始化一个容器
        c.setLayout(new BorderLayout());
        initFrame(); //调用生成窗体控件方法
        setResizable(false);
        setVisible(true);
    }

    private void initFrame() {
        //顶部
        JPanel titlePanel = new JPanel(); //定义一个面板
        titlePanel.setLayout(new FlowLayout());
        titlePanel.add(new JLabel("欢迎使用学生管理系统")); //欢迎词
        c.add(titlePanel, "North"); //使其位于上方

        //中部表单
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(null);
        JLabel l1 = new JLabel("用户名:");
        l1.setBounds(50, 20, 50, 20); //设置标签位置和大小
        JLabel l2 = new JLabel("密    码:");
        l2.setBounds(50, 60, 50, 20);
        fieldPanel.add(l1);
        fieldPanel.add(l2);
        jtfUser = new JTextField();
        jpfPwd = new JPasswordField();
        jtfUser.setBounds(110, 20, 120, 20); //设置文本框位置和大小
        jpfPwd.setBounds(110, 60, 120, 20);
        fieldPanel.add(jtfUser);
        fieldPanel.add(jpfPwd);
        c.add(fieldPanel, "Center");

        //底部按钮
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        jbSend = new JButton("确定");
        jbCancel = new JButton("取消");
        jbSend.addActionListener(this);
        jbCancel.addActionListener(this);
        buttonPanel.add(jbSend);
        buttonPanel.add(jbCancel);
        c.add(buttonPanel, "South");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbSend) { //单击确定按钮
            //验证用户名和密码是否正确，如果正确，打开主界面
            user = jtfUser.getText().trim(); //获取用户名
            pwd = new String(jpfPwd.getPassword()); //获取密码
            int authority = -1;
            //查找数据库
            SqlHelper sh = null;
            try {
                sh = new SqlHelper();
            } catch (UnsupportedEncodingException ex) {
                throw new RuntimeException(ex);
            }
            String strSel = "SELECT * FROM tbuser WHERE username = '"
                    + user + "' AND password = '"
                    + pwd + "'";
            System.out.println(strSel);
            ResultSet rs = sh.query(strSel);
            try {
                while (rs.next()) {
                    authority = 1;
                }
                rs.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

            sh.close();

            //用户名或密码错误提示
            if (-1 == authority) {

                JOptionPane.showMessageDialog(null,
                        "用户名或者密码错误", "错误",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            //System.out.println("权限: " + authority);
            //打开主窗口，隐藏登录窗口
            MainWindow mainW = new MainWindow(authority);
            mainW.setVisible(true);
            this.dispose();

        } else if (e.getSource() == jbCancel) { //单击取消按钮
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
