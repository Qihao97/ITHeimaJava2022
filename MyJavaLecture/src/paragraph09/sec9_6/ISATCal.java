package paragraph09.sec9_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/9:55
 * @Descriptions:
 */
public class ISATCal extends JFrame implements ItemListener, ActionListener {//双监听器
    JTextArea jta1;
    JTextField jtf1;
    JButton jb2;
    JRadioButton jrb1, jrb2;
    ButtonGroup g;

    public ISATCal() {
        super("统计计算器");
        jta1 = new JTextArea("", 6, 20);
        jta1.setLineWrap(true);
        jtf1 = new JTextField("", 20);
        jtf1.setEditable(false);
        jrb1 = new JRadioButton("SUM");
        jrb2 = new JRadioButton("AVG");
        g = new ButtonGroup();
        g.add(jrb1);
        g.add(jrb2);
        jb2 = new JButton("清除");
        jrb1.addItemListener(this);//注册Item监听器
        jrb2.addItemListener(this); //注册Item监听器
        jb2.addActionListener(this); //注册Action监听器
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(jta1);
        contentPane.add(jtf1);
        contentPane.add(jrb1);
        contentPane.add(jrb2);
        contentPane.add(jb2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 180);
        setVisible(true);
    }

    public static void main(String[] args) {
        ISATCal test = new ISATCal();
    }

    public void itemStateChanged(ItemEvent e) {//ItemListener接口的方法
        String s = jta1.getText();
        StringTokenizer tokens = new StringTokenizer(s);
        int n = tokens.countTokens(), i;
        double sum = 0.0;
        for (i = 0; i < n; i++) {
            sum += Double.parseDouble(tokens.nextToken());
        }
        if (e.getItemSelectable() == jrb1)//判断被选择的单项按钮是否为jrb1
            jtf1.setText("" + sum);
        else if (e.getItemSelectable() == jrb2) //判断被选择的单项按钮是否为jrb2
            jtf1.setText("" + (float) sum / n);
    }

    public void actionPerformed(ActionEvent e) {//ActionListener接口的方法
        g.clearSelection();//使按钮组g中的单选按钮回复到皆不选中的状态
        jta1.setText(null);
        jtf1.setText(null);
    }
}
