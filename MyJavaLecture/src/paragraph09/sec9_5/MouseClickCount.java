package paragraph09.sec9_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/9:49
 * @Descriptions:
 */
public class MouseClickCount extends JFrame {
    JLabel jl1;
    JButton jb1;
    int count = 0;

    public MouseClickCount() {
        super("统计鼠标点击按钮次数");
        jl1 = new JLabel("0");
        jb1 = new JButton("Click Me");
        jb1.addMouseListener(new BListener());//注册监听器
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(jb1);
        contentPane.add(jl1);
        setSize(250, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MouseClickCount test = new MouseClickCount();
    }

    class BListener extends MouseAdapter {//监听器通过继承适配器实现

        public void mouseClicked(MouseEvent e) {//仅实现需要的方法
            count++;
            jl1.setText(String.valueOf(count));
        }
    }
}
