package paragraph09.sec9_6;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/9:52
 * @Descriptions:
 */
public class GridSATCal extends JFrame {
    JPanel jp1, jp2;//声明面板
    JTextArea jta1;
    JTextField jtf1;
    JRadioButton jrb1, jrb2;
    ButtonGroup g;

    public GridSATCal() {
        super("统计计算器");
        jta1 = new JTextArea(6, 20);
        jta1.setLineWrap(true);
        jtf1 = new JTextField(20);
        jtf1.setEditable(false);
        jrb1 = new JRadioButton("SUM");
        jrb2 = new JRadioButton("AVG");
        g = new ButtonGroup();
        g.add(jrb1);
        g.add(jrb2);
        jp1 = new JPanel(new GridLayout(2, 1, 10, 10));//创建带布局的面板
        jp2 = new JPanel(new GridLayout(2, 2, 10, 10));
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1, 2, 10, 10));//设置内容面板布局
        contentPane.add(jta1);
        contentPane.add(jp1);//内容面板添加面板jp1
        jp1.add(jtf1);
        jp1.add(jp2);//jp1面板添加面板jp2
        jp2.add(jrb1);
        jp2.add(jrb2);
        jp2.add(new JButton("计算"));
        jp2.add(new JButton("清除"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        GridSATCal test = new GridSATCal();
    }
}
