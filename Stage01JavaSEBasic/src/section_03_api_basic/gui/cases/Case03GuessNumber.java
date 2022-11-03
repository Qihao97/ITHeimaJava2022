package section_03_api_basic.gui.cases;

import javax.swing.*;

/**
 * @Author: Qihao
 * @Time: 2022/2022/11/4/2:33
 * @Descriptions:猜数字案例
 */
public class Case03GuessNumber {
    public static void main(String[] args) {
        //        创建窗体对象
        JFrame jf = new JFrame("猜数字");

        jf.setVisible(true);
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

//        生成JLabel
        JLabel notice = new JLabel("系统生成了一个1-100之间的整数，请您猜一下！");
        notice.setBounds(70, 50, 350, 20);
        jf.add(notice);

//        生成文本框
        JTextField guessTextField = new JTextField();
        guessTextField.setBounds(120, 100, 150, 20);
        jf.add(guessTextField);

//        生成按钮
        JButton guessButton = new JButton("我猜");
        guessButton.setBounds(150, 150, 100, 20);
        jf.add(guessButton);

    }
}
