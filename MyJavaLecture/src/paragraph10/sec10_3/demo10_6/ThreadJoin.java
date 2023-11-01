package paragraph10.sec10_3.demo10_6;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:15 PM
 * @Descriptions: 10.6
 */
public class ThreadJoin {
    public static void main(String args[]) {
        ThreadPrinterA thread1 = new ThreadPrinterA("线程A");
        ThreadPrinterB thread2 = new ThreadPrinterB("线程B");
        thread1.setJoiner(thread2);  //将thread2设置为要加入的线程
        thread1.start();
        thread2.start();

        try {
            thread1.join(); //确保主线程最后结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");
    }
}
