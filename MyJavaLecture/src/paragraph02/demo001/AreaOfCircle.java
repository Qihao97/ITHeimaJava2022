package paragraph02.demo001;

import java.util.Scanner;

/**
 * @Author: Qihao
 * @Time: 2/18/2025 4:14 PM
 * @Descriptions: 2.1
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        // 定义半径变量
        double r;
//        r = 3.5;
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        r = sc.nextDouble();
        // 定义面积变量
        double area;
        // 定义Π
        final double PI = 3.1415926;
        area = PI * r * r;
        System.out.println("这个圆的面积是：" + area);

        boolean b = true;
        b = false;
    }
}
