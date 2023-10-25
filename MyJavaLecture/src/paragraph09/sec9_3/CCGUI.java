package paragraph09.sec9_3;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/8:00
 * @Descriptions:
 */
public class CCGUI {
    public static void main(String[] args) {
        JFrame jf1 = new JFrame("统计按钮单击次数");//创建窗口对象
        JButton jb1 = new JButton("Click Me");//创建按钮对象
        JLabel jl1 = new JLabel("Count");//创建标签对象
        Container contentPane = jf1.getContentPane();//获取窗口的内容面板
        contentPane.setLayout(new FlowLayout());//设置布局
        contentPane.add(jb1);//将按钮添加到内容面板
        contentPane.add(jl1);//将标签添加到内容面板
        jf1.setSize(250, 150);//设置窗口尺寸
        jf1.setVisible(true);//设置窗口可视
    }
}
