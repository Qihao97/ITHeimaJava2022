package paragraph10.sec10_2;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/10:56
 * @Descriptions:
 */
public class MultiThread {
    public static void main(String args[]) {
        ThreadPrinter thread1 = new ThreadPrinter("线程1");
        ThreadPrinter thread2 = new ThreadPrinter("线程2");
        thread1.start();
        thread2.start();
        System.out.println("主线程结束");
    }
}
