package section_03_api_basic.gui.cases;

import javax.swing.*;

/**
 * @Author: Qihao
 * @Time: 2022/2022/11/4/2:54
 * @Descriptions:考勤案例
 */
public class Case05Attendance {
    public static void main(String[] args) {
        //        创建窗体对象
        JFrame jf = new JFrame("用户登录");

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

    }
}
