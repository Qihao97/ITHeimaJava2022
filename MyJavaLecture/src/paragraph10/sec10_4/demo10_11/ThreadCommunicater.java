package paragraph10.sec10_4.demo10_11;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:30 PM
 * @Descriptions: 10.11
 */
public class ThreadCommunicater extends Thread {
    public static void main(String args[]) {
        ThreadSellandRefund t = new ThreadSellandRefund();
        Thread thread1 = new Thread(t, "售票窗口");
        Thread thread2 = new Thread(t, "退票窗口");
        thread1.start();
        thread2.start();
    }
}
