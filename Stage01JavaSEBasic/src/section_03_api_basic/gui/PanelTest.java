package section_03_api_basic.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/18/17:01
 * @Descriptions: Panel类测试
 */
public class PanelTest {
    public static void main(String[] args) {
        Frame frame = new Frame("Panel应用示例");

//        布局
        Panel panel = new Panel();

//        设计布局
        frame.setLayout(null);
//        设置坐标
        frame.setBounds(300, 300, 500, 500);
//        设置背景
        frame.setBackground(Color.green);
//        设置可视
        frame.setVisible(true);

//        panel设置坐标，相对于frame坐标
        panel.setBounds(50, 50, 400,400);
        panel.setBackground(Color.yellow);

//        将panel加入frame
        frame.add(panel);

//        设置监听事件，监听窗口关闭事件 System.exit()
//        适配器模式
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
