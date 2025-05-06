package paragraph03.sec3_5.cylinder;

/**
 * @Author: Qihao
 * @Time: 2023/8/30 10:57
 * @Descriptions: 本类用于使用带static成员变量的Cylinder， P65,程序3.8
 */
public class StaticApp {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(3.5, 7);
        System.out.println("创建了" + Cylinder.num + "个圆柱体对象。");
        cylinder1.count();
        System.out.println("圆柱体cylinder1的体积为： " + cylinder1.volume());
        Cylinder cylinder2 = new Cylinder(6.88, 9);
        System.out.println("创建了" + Cylinder.num + "个圆柱体对象。");

        cylinder2.count();
        System.out.println("圆柱体cylinder2的体积为： " + cylinder2.volume());
    }
}
