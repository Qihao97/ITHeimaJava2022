package paragraph10.sec10_3.demo10_7;

import java.text.DateFormat;
import java.util.Date;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:17 PM
 * @Descriptions: 10.7
 */
public class Learning implements Runnable {
    Thread sleepThread;   // interruptedThread为要被唤醒的休眠线程

    public void setSleepThread(Thread t) {  //指定要被唤醒线程
        sleepThread = t;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        if (name.equals("学生")) {
            System.out.println(name + "正在学习");
            System.out.println(name + DateFormat.getTimeInstance().format(new Date()) + "开始睡觉");
            try {
                Thread.sleep(1000 * 60 * 60);//休眠一小时
            } catch (InterruptedException e) {
                System.out.println(name + DateFormat.getTimeInstance().format(new Date()) + "被叫醒"); // DateFormat.getTimeInstance().format(new Date())返回当前系统时间
            }
            System.out.println(name + "继续学习");
        }
        if (name.equals("教师")) {
            try {
                Thread.sleep(1000 * 10);     //10秒后教师走进教室叫醒学生
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "说：赶快学习");
            sleepThread.interrupt(); //中断sleepThread的休眠
        }
    }
}
