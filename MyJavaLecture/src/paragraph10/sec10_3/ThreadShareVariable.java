package paragraph10.sec10_3;

import paragraph10.sec10_2.ThreadSell;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:09 PM
 * @Descriptions: 程序10.5
 */
public class ThreadShareVariable extends Thread{
    public static void main(String args[]){
        ThreadSell t=new ThreadSell();
        Thread thread1=new Thread (t, "售票窗口A") ;
        Thread thread2=new Thread (t, "售票窗口B");
        Thread thread3=new Thread (t, "售票窗口C");
        thread2. setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
