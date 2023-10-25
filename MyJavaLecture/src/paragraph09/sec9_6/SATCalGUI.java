package paragraph09.sec9_6;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/9:51
 * @Descriptions:
 */
public class SATCalGUI extends JFrame {
    JTextArea jta1;
    JTextField jtf1;
    JButton jb1, jb2;
    JRadioButton jrb1, jrb2;
    ButtonGroup g;//单选按钮组

    public SATCalGUI() {
        super("统计计算器");
        jta1 = new JTextArea(6, 20);
        jta1.setLineWrap(true);//设置文本域自动换行
        jtf1 = new JTextField(20);
        jtf1.setEditable(false);//设置文本框不可编辑
        jrb1 = new JRadioButton("SUM", true);
        jrb2 = new JRadioButton("AVG");
        g = new ButtonGroup();
        g.add(jrb1);
        g.add(jrb2);//将单选按钮加入按钮组
        jb1 = new JButton("计算");
        jb2 = new JButton("清除");
        Container contentPane = getContentPane();//获取内容面板
        contentPane.setLayout(new FlowLayout());//设置布局为流式布局
        contentPane.add(jta1);
        contentPane.add(jtf1);
        contentPane.add(jrb1);
        contentPane.add(jrb2);
        contentPane.add(jb1);
        contentPane.add(jb2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 180);
        setVisible(true);
    }

    public static void main(String[] args) {
        SATCalGUI test = new SATCalGUI();
    }
}
