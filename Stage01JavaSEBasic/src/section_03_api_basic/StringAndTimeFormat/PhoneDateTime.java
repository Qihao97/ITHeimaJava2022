package section_03_api_basic.StringAndTimeFormat;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author ：Qihao
 * @Time ：2022/11/07/10:22
 * @Description ：手机日期和时间的显示实现
 * 根据当前时间，分别获取日期和时间，并分别显示
 */
public class PhoneDateTime {
    public static void main(String[] args) {
//        创建窗体对象
        JFrame jf = new JFrame("显示日期和时间");

        jf.setVisible(true);
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

//        获取时间
        Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
//        将时间转为字符串
        String date_ymd = sdf1.format(date);
        String time_hms = sdf2.format(date);

//        提示日期
        JLabel dateTitle = new JLabel("日期：");
        dateTitle.setBounds(50, 50, 100, 20);
        jf.add(dateTitle);

//        日期内容
        JLabel dateContent = new JLabel(date_ymd);
        dateContent.setBounds(50, 80, 200, 20);
        jf.add(dateContent);

//        提示时间
        JLabel timeTitle = new JLabel("时间：");
        timeTitle.setBounds(50, 150, 100, 20);
        jf.add(timeTitle);

//        时间内容
        JLabel timeContent = new JLabel(time_hms);
        timeContent.setBounds(50, 180, 200, 20);
        jf.add(timeContent);

    }
}
