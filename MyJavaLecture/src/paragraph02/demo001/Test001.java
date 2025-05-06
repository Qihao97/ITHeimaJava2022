package paragraph02.demo001;

import java.util.Scanner;

/**
 * @Author: Qihao
 * @Time: 3/8/2025 8:47 AM
 * @Descriptions:
 */
public class Test001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入半径：");
        double radius = input.nextDouble();
        double area = 0;
        double pi = 3.1415926;
        area = pi * radius * radius;
        System.out.println("这个圆的半径是：" + radius);
        System.out.println("这个圆的面积是：" + area);

        System.out.println("--------------");
        System.out.println('\n');
        if (area == 9) {
            System.out.println("222");
        }
    }

    public void abc() {
        System.out.println();
    }
}
