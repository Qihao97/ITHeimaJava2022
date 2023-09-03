package paragraph07.sec7_1;

/**
 * @Author: Qihao
 * @Time: 2023/9/3 20:51
 * @Descriptions: 测试0作为除数异常
 */
public class DivideZero {
    int x;

    public static void main(String[] args) {
        int y;
        DivideZero divideZero = new DivideZero();
        y = 3 / divideZero.x;
//        会报错
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at paragraph07.sec7_1.DivideZero.main(DivideZero.java:14)
        System.out.println("Program ends ok!");
    }
}
