package paragraph03.sec3_5.cylinder2;

/**
 * @Author: Qihao
 * @Time: 2023/8/31 21:01
 * @Descriptions: 增加static方法，P67，程序3.9
 */
public class Cylinder {
    private static int num = 0;
    private static double pi = 3.14;
    private double radius;
    private int height;

    public Cylinder(double r, int h) {
        radius = r;
        height = h;
        num++;
    }

    public static void count()       //把count方法声明为static方法
    {
        System.out.print("创建了" + num + "个对象：");
    }

    double area() {
        return pi * radius * radius;
    }

    double volume() {
        return area() * height;
    }
}
