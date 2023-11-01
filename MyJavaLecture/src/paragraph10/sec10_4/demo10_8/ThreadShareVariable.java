package paragraph10.sec10_4.demo10_8;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:22 PM
 * @Descriptions: 10.8
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
