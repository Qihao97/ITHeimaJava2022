package paragraph02.sec2_4;

import java.util.Scanner;

/**
 * @Author: Qihao
 * @Time: 2023/8/29 16:28
 * @Descriptions: 书上36页程序，在计算圆的面积之前，先判断输入的半径是否合法
 */
public class AreaOfCircle4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //创建Scanner类的对象
        System.out.println("请输入半径：");
        double radius = input.nextDouble();         //让用户输入半径，并使用变量接收
        double area;                                //声明面积变量
        final double PI = 3.1415926;                //将圆周率定义为常量
        //增加一个判断逻辑，当输入的半径小于0的时候，提示输入参数错误
        if (radius < 0){
            System.out.println("输入的半径不合法！程序结束");
        }
        else {
            area = radius * radius * PI;     //计算面积
            System.out.println("The radius is " + radius);
            System.out.println("The area of the circle is " + area);    //输出
        }
    }
}
