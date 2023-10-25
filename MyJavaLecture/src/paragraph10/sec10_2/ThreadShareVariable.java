package paragraph10.sec10_2;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/10:58
 * @Descriptions:
 */
public class ThreadShareVariable extends Thread {
    public static void main(String args[]) {
        ThreadSell t = new ThreadSell();
        Thread thread1 = new Thread(t, "售票窗口A");
        Thread thread2 = new Thread(t, "售票窗口B");
        Thread thread3 = new Thread(t, "售票窗口C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
