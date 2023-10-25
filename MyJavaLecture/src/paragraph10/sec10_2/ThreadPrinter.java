package paragraph10.sec10_2;

/**
 * @Author: Qihao
 * @Time: 2023/10/25/10:55
 * @Descriptions:
 */
public class ThreadPrinter extends Thread {
    public ThreadPrinter(String s) {
        super(s);
    }

    public void run() {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "打印" + i); //① 输出当前正在使用CPU资源的线程的名字以及正在打印的i的值
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }
}
