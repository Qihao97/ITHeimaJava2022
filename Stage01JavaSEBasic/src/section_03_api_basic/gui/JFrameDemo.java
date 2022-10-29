package section_03_api_basic.gui;

import javax.swing.*;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/17/19:42
 * @Descriptions: JFrame实现一个无内容窗体
 */

/**
 *  void setSize(int width, int hight)      设置窗体的宽高
 *  void setVisible(boolean b)      设置窗体是否可见
 *  void setTitle(String title)     设置窗体标题
 *  void setLocationRelativeTo(Component c)     设置位置，值为null时，窗体位于屏幕中央
 *  void setDefaultCloseOperation(int operation):       设置窗体关闭时默认操作（整数3表示窗体关闭时退出）
 *  void setAlwaysOnTop(boolean alwaysOnTop):       设置此窗口是否应始终位于其他窗口之上
 */
public class JFrameDemo {
    public static void main(String[] args) {
//        构建一个不可见的窗体
        JFrame jFrame = new JFrame();

//        设置窗体大小
        jFrame.setSize(400,300);
//        设置窗体标题
        jFrame.setTitle("This is a window.");
//        设置窗体位置
        jFrame.setLocationRelativeTo(null);
//        设置窗体关闭时默认操作
        jFrame.setDefaultCloseOperation(3);



//        使该窗体可见
        jFrame.setVisible(true);
    }
}
