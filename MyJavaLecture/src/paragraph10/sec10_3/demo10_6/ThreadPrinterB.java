package paragraph10.sec10_3.demo10_6;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:14 PM
 * @Descriptions: 10.6
 */
public class ThreadPrinterB extends Thread {
    public ThreadPrinterB(String s) {
        super(s);
    }

    @Override
    public void run() {
        int i;
        try {
            Thread.sleep(3000);   //休眠3秒钟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (i = 1; i <= 5; i++)
            System.out.println("字母B" + i + "次"); //① 输出字母B
    }
}
