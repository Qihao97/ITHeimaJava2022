package paragraph03.sec3_3.cylinderDemo;

/**
 * @Author: Qihao
 * @Time: 2023/8/30 8:59
 * @Descriptions: 创建圆柱体Cylinder类
 */
public class Cylinder {
    private static double PI = 3.1415926;
    private double radius;
    private int height;

    public Cylinder(){}
    public Cylinder(double radius, int height) {
        this.radius = radius;
        this.height = height;
//        System.out.println("李二狗");
    }

    public void compare(Cylinder v) {
        if (this == v) {
            System.out.println("这两个对象相等！");
        }
        else {
            System.out.println("这两个对象不相等！");
        }
    }
}
