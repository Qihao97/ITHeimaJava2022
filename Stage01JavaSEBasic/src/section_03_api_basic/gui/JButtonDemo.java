package section_03_api_basic.gui;

import javax.swing.*;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/17/19:47
 * @Descriptions: JButton基本使用
 * 构造方法：
 * JButton(String text):        创建一个带文本的按钮
 * 成员方法：
 * void setSize(int width, int height);     设置按钮的大小
 * void setLocation(int x, int y);      设置位置，（x坐标， y坐标）
 */
public class JButtonDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("窗口中添加按钮");
        jFrame.setSize(400,300);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLocationRelativeTo(null);
        jFrame.setAlwaysOnTop(true);
//        取消窗体的默认布局
        jFrame.setLayout(null);

//        创建一个带文本的按钮
        JButton button = new JButton("我是按钮");
//        设置按钮大小
//        button.setSize(100,20);
//        设置按钮位置
//        button.setLocation(100,100);

//        设置按钮大小和位置
        button.setBounds(100, 100, 100, 20);

        JButton button_2 = new JButton("Button_2");
        button_2.setBounds(100, 200, 100, 20);

//        设置窗体可见
        jFrame.setVisible(true);

//        将按钮添加到窗体上
        jFrame.add(button);
        jFrame.add(button_2);
    }
}
