package section_03_api_basic.gui;

import javax.swing.*;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/17/19:42
 * @Descriptions:
 */
public class JFrameDemo {
    public static void main(String[] args) {
//        构建一个不可见的窗体
        JFrame jFrame = new JFrame();

//        设置窗体大小
        jFrame.setSize(400,300);

//        使该窗体可见
        jFrame.setVisible(true);
    }
}
