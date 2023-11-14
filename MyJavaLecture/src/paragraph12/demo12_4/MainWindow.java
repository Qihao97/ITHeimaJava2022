package paragraph12.demo12_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author: Qihao
 * @Time: 11/14/2023 7:44 PM
 * @Descriptions: MainWindow
 */
public class MainWindow extends JFrame implements ActionListener {

    private int authority; //用户权限
    private JButton jbSelect = new JButton("查询");
    private JButton jbAdd = new JButton("添加");
    private JButton jbUpdate = new JButton("修改");
    private JButton jbDelete = new JButton("删除");
    private Container c = null;

    MainWindow(int authority) {
        setTitle("学生管理主界面");

        // 获取屏幕的尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setSize(400, 300);
        int width = getWidth();
        int height = getHeight();
        //窗口居中
        setLocation((screenWidth - width) / 2, (screenHeight - height) / 2);

        initFrame();
        this.authority = authority;
        setAuthority();
        setResizable(false);
    }

    private void initFrame() {
        c = getContentPane(); //初始化一个容器
        c.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(null);
        jbSelect.setBounds(50, 50, 60, 30);
        jbAdd.setBounds(130, 50, 60, 30);
        jbUpdate.setBounds(210, 50, 60, 30);
        jbDelete.setBounds(290, 50, 60, 30);
        panel.add(jbSelect);
        panel.add(jbAdd);
        panel.add(jbUpdate);
        panel.add(jbDelete);
        c.add(panel, "Center");
        jbSelect.addActionListener(this);
        jbAdd.addActionListener(this);
        jbUpdate.addActionListener(this);
        jbDelete.addActionListener(this);

        //关闭窗口时，退出程序
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
    }

    private void setAuthority() {
        //根据权限禁用某些功能
        if (this.authority > 1) {
            this.jbAdd.setEnabled(false);
            this.jbDelete.setEnabled(false);
            this.jbUpdate.setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == jbSelect) {
            //打开查询窗口
            SelectPage selPage = new SelectPage(this);
            selPage.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == jbAdd) {
            //打开新增记录窗口
            InsertPage insPage = new InsertPage(this);
            insPage.setVisible(true);
            this.setVisible(false);

        } else if (e.getSource() == jbUpdate) {
            //打开修改记录窗口
            UpdatePage updatePage = new UpdatePage(this);
            updatePage.setVisible(true);
            this.setVisible(false);

        } else if (e.getSource() == jbDelete) {
            //打开删除记录窗口
            DeletePage delPage = new DeletePage(this);
            delPage.setVisible(true);
            this.setVisible(false);
        }
    }

    /*
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MainWindow win = new MainWindow(1);
        win.setVisible(true);
    }
    */
}

