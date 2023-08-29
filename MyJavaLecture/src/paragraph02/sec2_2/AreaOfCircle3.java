package paragraph02.sec2_2;

import java.util.Scanner;

/**
 * @Author: Qihao
 * @Time: 2023/8/29 15:14
 * @Descriptions: 书上22页程序2.3，将圆周率定义为一个常量
 */
public class AreaOfCircle3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //创建Scanner类的对象
        System.out.println("请输入半径：");
        double radius = input.nextDouble();         //让用户输入半径，并使用变量接收
        double area;                                //声明面积变量
        final double PI = 3.1415926;                //将圆周率定义为常量
        area = radius * radius * PI;     //计算面积
        System.out.println("The radius is " + radius);
        System.out.println("The area of the circle is " + area);    //输出
    }
}
