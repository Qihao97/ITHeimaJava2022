package section_03_api_basic.gui.cases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Qihao
 * @Time: 2022/2022/11/4/3:19
 * @Descriptions:事件监听机制
 */
public class Case06EventListener {
    public static void main(String[] args) {
        //        创建窗体对象
        JFrame jf = new JFrame("事件监听机制");

        jf.setVisible(true);
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

//        创建按钮
        JButton button = new JButton("按钮");
        button.setBounds(0, 0, 100, 100);
        jf.add(button);

//        给按钮添加事件触发机制
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("您点击了按钮！");
            }
        });

    }
}
