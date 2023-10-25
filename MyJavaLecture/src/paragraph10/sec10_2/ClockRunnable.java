package paragraph10.sec10_2;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/10:31
 * @Descriptions:
 */
public class ClockRunnable implements Runnable {
    ClockWithRunnable t;

    public ClockRunnable(ClockWithRunnable c) {
        super();
        t = c;
    }

    public void run() {
        while (true) {   //isAlive()用于判断线程是否是活动状态
            t.display();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("thread interrupted.");
            }
        }
    }

}
