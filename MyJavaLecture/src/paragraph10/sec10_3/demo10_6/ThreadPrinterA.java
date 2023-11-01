package paragraph10.sec10_3.demo10_6;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:13 PM
 * @Descriptions: 10.6
 */
public class ThreadPrinterA extends Thread {
    Thread joiner;     //定义加入的线程

    public ThreadPrinterA(String s) {
        super(s);
    }

    public void setJoiner(Thread t) {  //指定要加入的线程
        joiner = t;
    }

    @Override
    public void run() {
        int i;
        for (i = 1; i <= 5; i++) {

            System.out.println("字母A" + i + "次"); //① 输出字母A
            try {
                joiner.join();   //对指定的joiner调用join()方法挂起本线程，等待joiner执行完毕后，本线程再进入可运行状态，等待CPU。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
