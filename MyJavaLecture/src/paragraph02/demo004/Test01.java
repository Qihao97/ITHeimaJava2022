package paragraph02.demo004;

import java.util.Scanner;

/**
 * @Author: Qihao
 * @Time: 2023/9/13/15:55
 * @Descriptions: 带有主方法的类，演示重载方法
 */
public class Test01 {
    public static void main(String[] args) {
        int a, b;
        double d1, d2;
        Scanner scanner = new Scanner(System.in);
/*        System.out.println("请输入两个整数：");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(add(a, b));*/
        System.out.println("请输入两个小数：");
        d1 = scanner.nextDouble();
        d2 = scanner.nextDouble();
        System.out.println(add(d1,d2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
