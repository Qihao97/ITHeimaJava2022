package paragraph10.sec10_2;

import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/10:13
 * @Descriptions: 通过继承Thread类创建线程，实现一个简易时钟
 */
public class ClockWithThread extends JPanel {
    protected JLabel lb;

    public ClockWithThread() {
        lb = new JLabel("", JLabel.CENTER);
        add(lb, BorderLayout.CENTER);
    }

    public static void main(String args[]) {
        ClockWithThread cl = new ClockWithThread();
        JFrame win = new JFrame("Clock");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setContentPane(cl);
        win.setSize(200, 80);
        win.setVisible(true);
        ClockThread clock = new ClockThread("clock", cl); // ①创建线程
        clock.start();
    }

    public void display() {
        lb.setText((new GregorianCalendar()).getTime().toString());  //②查询系统时钟
    }
}

class ClockThread extends Thread {
    ClockWithThread t;

    public ClockThread(String s, ClockWithThread c) {
        super(s);
        t = c;
    }

    public void run() {
        while (this.isAlive()) {
            t.display();
            try {
                Thread.sleep(1000);   //③休眠1秒
            } catch (InterruptedException e) {
                System.out.println("thread interrupted.");
            }
        }
    }
}
