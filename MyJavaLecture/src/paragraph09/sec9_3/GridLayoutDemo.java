package paragraph09.sec9_3;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/9:13
 * @Descriptions:
 */
public class GridLayoutDemo extends JFrame {
    public GridLayoutDemo() {
        super("GridLayout演示");
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new GridLayout(2, 2));//设置内容面板的布局
        contentPane.add(new JButton("Button1"));
        contentPane.add(new JLabel("Label1"));
        contentPane.add(new JLabel("Label2"));
        contentPane.add(new JButton("Button2"));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        GridLayoutDemo gridLayoutDemo = new GridLayoutDemo();
    }
}
