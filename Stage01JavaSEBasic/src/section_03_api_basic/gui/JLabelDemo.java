package section_03_api_basic.gui;

import javax.swing.*;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/17/23:26
 * @Descriptions: JLabel类示例，显示文本，显示图像
 */
public class JLabelDemo {
    public static void main(String[] args) {
//       创建窗体对象
        JFrame jFrame = new JFrame();

        jFrame.setTitle("显示文本和图像");
        jFrame.setSize(1000,700);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLocationRelativeTo(null);
        jFrame.setAlwaysOnTop(true);
//        取消窗体的默认布局
        jFrame.setLayout(null);


//        JLabel(String text) 使用指定的文本创建JLabel实例
        JLabel jLabel = new JLabel("好好学习");
        jLabel.setBounds(0, 0, 100, 20);

//        JLabel(ImageIcon image) 使用图像创建JLabel实例
        JLabel jLabel2 = new JLabel(new ImageIcon("E:\\Exercises\\ITHeimaJava2022\\Stage01JavaSEBasic\\src\\section_03_api_basic\\gui\\1.png"));
        jLabel2.setBounds(50, 50, 246, 204);

        jFrame.add(jLabel);
        jFrame.add(jLabel2);
        jFrame.setVisible(true);

    }
}
