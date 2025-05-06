package paragraph07.sec7_2;

/**
 * @Author: Qihao
 * @Time: 2023/9/3 21:07
 * @Descriptions: P171，程序7.4
 */
public class DivideZero1 {
    int x;

    public static void main(String[] args) {
        int y;
        DivideZero1 c = new DivideZero1();
        try {
            y = 3 / c.x;
        } catch (ArithmeticException e) {
            System.out.println("divide by zero error!");
            System.out.println(e.toString());
        }
        System.out.println("program ends ok!");
    }
}
