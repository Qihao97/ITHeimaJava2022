package paragraph10.sec10_4.demo10_11;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:29 PM
 * @Descriptions: 10.11
 */
public class ThreadSellandRefund implements Runnable {
    private int tickets = 0;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.contains("售票窗口")) {
            for (int i = 0; i < 3; i++)
                sell();
        }
        if (name.equals("退票窗口")) {
            for (int i = 0; i < 3; i++)  //每隔一段时间退票一张
            {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                refund();
            }
        }
    }

    private synchronized void sell() {
        if (tickets <= 0) {            //①车票余票为0时需要等待
            System.out.println(Thread.currentThread().getName() + "说：车票已经售完，请等待退票！");
            try {
                wait();          //② 挂起线程，释放管程
            } catch (InterruptedException e) {
                e.printStackTrace();    //③wait()被中断时会抛出异常
            }
        }
        System.out.println(Thread.currentThread().getName() + "售出一张车票, 车票余量为" + (--tickets) + "张");
    }

    private synchronized void refund() {
        tickets++;
        System.out.println(Thread.currentThread().getName() + "退回一张车票, 车票余量为" + tickets + "张");
        notifyAll();
    }
}