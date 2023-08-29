package paragraph02.sec2_1;

/**
 * @Author: Qihao
 * @Time: 2023/8/29 10:24
 * @Descriptions: 教材19页，程序2.1，求圆的面积
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        double radius;      //声明半径
        double area;        //声明面积
        radius = 5.0;       //给变量赋值
        area = radius * radius * 3.1415926;     //计算面积
        System.out.println("The radius is " + radius);
        System.out.println("The area of the circle is " + area);    //输出
    }
}
