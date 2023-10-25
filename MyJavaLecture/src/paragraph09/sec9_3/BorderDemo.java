package paragraph09.sec9_3;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/8:57
 * @Descriptions:
 */
public class BorderDemo extends JFrame {
    public BorderDemo() {
        super("BorderLayout演示");
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());//设置内容面板的布局
        contentPane.add(new JLabel("东"), "East");
        contentPane.add("West", new JLabel("西"));
        contentPane.add("South", new JLabel("南", JLabel.CENTER));
        contentPane.add(new JLabel("北", JLabel.CENTER), "North");
        contentPane.add(new JLabel("中", JLabel.CENTER));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250, 150);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        BorderDemo bd = new BorderDemo();
    }
}
