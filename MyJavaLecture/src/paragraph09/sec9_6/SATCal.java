package paragraph09.sec9_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/9:53
 * @Descriptions:
 */
public class SATCal extends JFrame implements ActionListener {//窗口实现监听器接口
    JTextArea jta1;
    JTextField jtf1;
    JButton jb1, jb2;
    JRadioButton jrb1, jrb2;
    ButtonGroup g;

    public SATCal() {
        super("统计计算器");
        jta1 = new JTextArea("", 6, 20);
        jta1.setLineWrap(true);
        jtf1 = new JTextField("", 20);
        jtf1.setEditable(false);
        jrb1 = new JRadioButton("SUM", true);
        jrb2 = new JRadioButton("AVG");
        g = new ButtonGroup();
        g.add(jrb1);
        g.add(jrb2);
        jb1 = new JButton("计算");
        jb2 = new JButton("清除");
        jb1.addActionListener(this);//为按钮jb1注册监听器，监听器为窗口
        jb2.addActionListener(this); //为按钮jb2注册监听器，监听器为窗口
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(jta1);
        contentPane.add(jtf1);
        contentPane.add(jrb1);
        contentPane.add(jrb2);
        contentPane.add(jb1);
        contentPane.add(jb2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 180);
        setVisible(true);
    }

    public static void main(String[] args) {
        SATCal test = new SATCal();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb1) {//判断事件源是否为jb1
            String s = jta1.getText();
            StringTokenizer tokens = new StringTokenizer(s);
            int n = tokens.countTokens(), sum = 0, i;
            for (i = 0; i < n; i++) {
                sum += Integer.parseInt(tokens.nextToken());
            }
            if (n == 0) {
                jtf1.setText("0");
                return;
            }
            if (jrb1.isSelected())//判断单选按钮jrb1是否被选中
                jtf1.setText("" + sum);
            else
                jtf1.setText("" + (float) sum / n);
        } else if (e.getSource() == jb2) {//判断事件源是否为jb2
            jta1.setText(null);
            jtf1.setText(null);
            jrb1.setSelected(true);//设置为选中状态
            jrb2.setSelected(false);//设置为非选中状态
        }
    }
}
