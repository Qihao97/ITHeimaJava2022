package paragraph10.sec10_4.demo10_8;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:21 PM
 * @Descriptions: 10.8
 */
public class ThreadSell implements Runnable {
    private int tickets = 10;

    @Override
    public void run() {
        while (tickets > 0) {     //①

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "售出座位号为" + (11 - tickets) + "的车票, 车票余量为" + (--tickets) + "张");
        }

        System.out.println("车票售罄");
        System.exit(0);
    }
}
