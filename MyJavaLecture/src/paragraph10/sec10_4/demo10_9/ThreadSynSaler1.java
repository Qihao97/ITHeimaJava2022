package paragraph10.sec10_4.demo10_9;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:23 PM
 * @Descriptions: 10.9
 */
public class ThreadSynSaler1 implements Runnable {
    private int tickets = 10;

    @Override
    public void run() {
        while (true) {
            try {                    //保证每个售票窗口都有机会售出车票
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sell();
        }
    }

    private synchronized void sell() {    //sell()定义为同步方法

        if (tickets > 0) {                   //①
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "售出座位号为" + (11 - tickets) + "的车票, 车票余量为" + (--tickets) + "张");  //②
        } else {
            System.out.println("车票售罄");
            System.exit(0);
        }
    }
}
