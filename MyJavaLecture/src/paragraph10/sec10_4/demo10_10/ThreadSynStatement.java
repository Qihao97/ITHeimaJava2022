package paragraph10.sec10_4.demo10_10;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:27 PM
 * @Descriptions: 10.10
 */
public class ThreadSynStatement extends Thread {
    public static void main(String args[]) {

        ThreadSynSaler2 t = new ThreadSynSaler2();
        Thread thread1 = new Thread(t, "售票窗口A");
        Thread thread2 = new Thread(t, "售票窗口B");
        Thread thread3 = new Thread(t, "售票窗口C");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
