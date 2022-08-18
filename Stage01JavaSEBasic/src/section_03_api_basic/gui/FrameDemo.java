package section_03_api_basic.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/18/16:33
 * @Descriptions: Frame示例
 */
public class FrameDemo extends Frame {
    public static void main(String[] args) {
        FrameDemo frameDemo = new FrameDemo();
        frameDemo.init();
    }

    public void init(){
//        传递参数使得关闭按钮有效
        this.setTitle("Frame示例");
        this.setSize(400,300);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                Window window = (Window) e.getComponent();
                window.dispose();
            }
        });
    }
}
