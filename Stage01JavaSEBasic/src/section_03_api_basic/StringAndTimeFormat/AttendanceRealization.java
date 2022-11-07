package section_03_api_basic.StringAndTimeFormat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author ：Qihao
 * @Time ：2022/11/07/10:32
 * @Description ：考勤实现
 * 根据开始时间和结束时间的字符串解析为日期提示出来
 */
public class AttendanceRealization {
    public static void main(String[] args) {
//        创建窗体对象
        JFrame jf = new JFrame("考勤查询");

        jf.setVisible(true);
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

//        添加考勤日期提示
        JLabel attendanceDate = new JLabel("考勤日期");
        attendanceDate.setBounds(50, 20, 100, 20);
        jf.add(attendanceDate);

//        开始时间
        JLabel beginTime = new JLabel("开始时间");
        beginTime.setBounds(50, 70, 100, 20);
        jf.add(beginTime);

        JTextField beginTimeTextField = new JTextField();
        beginTimeTextField.setBounds(50, 100, 100, 20);
        jf.add(beginTimeTextField);

//        结束时间
        JLabel endTime = new JLabel("结束时间");
        endTime.setBounds(250,70, 100, 20);
        jf.add(endTime);

        JTextField endTimeTextField = new JTextField();
        endTimeTextField.setBounds(250, 100, 100, 20);
        jf.add(endTimeTextField);

//        确定按钮
        JButton confirmButton = new JButton("确定");
        confirmButton.setBounds(250, 180, 60, 20);
        jf.add(confirmButton);

//        实现功能
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

                String begin_date_text = beginTimeTextField.getText();
                String end_date_text = endTimeTextField.getText();

                try {
                    Date begin_date = sdf.parse(begin_date_text);
                    Date end_date = sdf.parse(end_date_text);

                    JOptionPane.showMessageDialog(jf, begin_date + "\n" + end_date);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

    }
}
