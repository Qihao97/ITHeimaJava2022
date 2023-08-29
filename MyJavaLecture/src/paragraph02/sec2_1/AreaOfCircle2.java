package paragraph02.sec2_1;

import java.util.Scanner;       //导入Scanner类

/**
 * @Author: Qihao
 * @Time: 2023/8/29 10:43
 * @Descriptions: 书上20页程序2.2，在程序2.1的基础上增加了用户输入半径功能
 */
public class AreaOfCircle2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //创建Scanner类的对象
        System.out.println("请输入半径：");
        double radius = input.nextDouble();         //让用户输入半径，并使用变量接收
        double area;                                //声明面积变量
        area = radius * radius * 3.1415926;     //计算面积
        System.out.println("The radius is " + radius);
        System.out.println("The area of the circle is " + area);    //输出
    }
}
