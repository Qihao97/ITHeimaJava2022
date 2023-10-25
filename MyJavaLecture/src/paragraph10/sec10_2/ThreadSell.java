package paragraph10.sec10_2;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/10:57
 * @Descriptions:
 */
public class ThreadSell implements Runnable {
    private int tickets = 10;

    public void run() {
        while (tickets > 0) {     //①
            System.out.println(Thread.currentThread().getName() + "售出座位号为" + (11 - tickets) + "的车票, 车票余量为" + (--tickets) + "张");
        }
    }
}
