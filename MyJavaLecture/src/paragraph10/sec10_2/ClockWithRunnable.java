package paragraph10.sec10_2;

import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/10:30
 * @Descriptions:
 */
public class ClockWithRunnable extends JPanel {
    protected JLabel lb;

    public ClockWithRunnable() {
        lb = new JLabel("", JLabel.CENTER);
        add(lb, BorderLayout.CENTER);

    }

    public static void main(String args[]) {
        ClockWithRunnable cl = new ClockWithRunnable();
        JFrame win = new JFrame("Clock");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setContentPane(cl);
        win.setSize(200, 80);
        win.setVisible(true);
        ClockRunnable r = new ClockRunnable(cl);
        Thread clock = new Thread(r, "ClockWithRunnable");
        clock.start();
    }

    public void display() {
        lb.setText((new GregorianCalendar()).getTime().toString());
    }

}
