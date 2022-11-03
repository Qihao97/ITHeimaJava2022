package section_03_api_basic.gui.cases;

import javax.swing.*;

/**
 * @Author: Qihao
 * @Time: 2022/2022/11/4/2:44
 * @Descriptions:日期和时间案例
 */
public class Case04PhoneDateTime {
    public static void main(String[] args) {
        //        创建窗体对象
        JFrame jf = new JFrame("显示日期和时间");

        jf.setVisible(true);
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

//        提示日期
        JLabel dateTitle = new JLabel("日期：");
        dateTitle.setBounds(50, 50, 100, 20);
        jf.add(dateTitle);

//        日期内容
        JLabel dateContent = new JLabel("xxxx年xx月xx日");
        dateContent.setBounds(50, 80, 200, 20);
        jf.add(dateContent);

//        提示时间
        JLabel timeTitle = new JLabel("时间：");
        timeTitle.setBounds(50, 150, 100, 20);
        jf.add(timeTitle);

//        时间内容
        JLabel timeContent = new JLabel("xx:xx");
        timeContent.setBounds(50, 180, 200, 20);
        jf.add(timeContent);

    }
}
