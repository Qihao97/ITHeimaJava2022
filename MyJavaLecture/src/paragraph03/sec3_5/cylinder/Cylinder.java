package paragraph03.sec3_5.cylinder;

/**
 * @Author: Qihao
 * @Time: 2023/8/30 10:42
 * @Descriptions: 在Cylinder类的基础上添加了static变量 P65,程序3.8
 */
public class Cylinder {
    public static int num = 0;
    public static double PI = 3.1415926;
    private double radius;
    private int height;
    public Cylinder(double radius, int height) {
        this.radius = radius;
        this.height = height;
        num ++;
    }
    public void count() {
        System.out.println("本类共创建了" + num + "个对象.");
    }

    double area() {
        return PI * radius * radius;
    }

    double volume() {
        return this.area() * height;
    }
}
