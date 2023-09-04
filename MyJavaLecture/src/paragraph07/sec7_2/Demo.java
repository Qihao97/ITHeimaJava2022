package paragraph07.sec7_2;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 9:18
 * @Descriptions: P175,程序7.8
 */
public class Demo {
    /*
     * 声明两个异常，在功能上通过throws关键字声明了该功能有可能会出现问题
     * */
    int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
        int[] arr = new int[a];
        System.out.println(arr[4]);
        return a/b;
    }
}
