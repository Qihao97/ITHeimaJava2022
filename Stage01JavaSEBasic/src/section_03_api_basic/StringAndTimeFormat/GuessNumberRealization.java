package section_03_api_basic.StringAndTimeFormat;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * @Author: Qihao
 * @Time: 2022/2022/11/5/23:10
 * @Descriptions:猜数字游戏实现
 * 需求：根据以下要求，实现猜数字游戏
 *    1.系统产生一个1-100之间的随机数；
 *    2.猜的内容不可以为空；
 *    3.每次根据猜的数字给出相应的提示。
 */
public class GuessNumberRealization {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("random number is:  " + number);

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

//        给按钮添加事件监听机制，实现猜数字逻辑
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                判断猜的内容不能为空
                String guessTextFieldText = guessTextField.getText().trim();
                if (guessTextFieldText.equals("")){
                    JOptionPane.showMessageDialog(jf, "猜的数字不能为空！");
                    return;
                }

//                每次根据猜的数字给出相应的提示
                int guessNumber = Integer.parseInt(guessTextFieldText);
                if (guessNumber > number){
                    JOptionPane.showMessageDialog(jf, "您猜的数字大了");
                    guessTextField.setText("");
                    return;
                }else if(guessNumber < number){
                    JOptionPane.showMessageDialog(jf, "您猜的数字小了");
                    guessTextField.setText("");
                    return;
                } else if (guessNumber == number) {
                    JOptionPane.showMessageDialog(jf, "您猜对了");
                }
            }
        });

    }
}
