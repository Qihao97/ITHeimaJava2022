package paragraph03.sec3_5.cylinder2;

/**
 * @Author: Qihao
 * @Time: 2023/8/31 21:05
 * @Descriptions: 用来测试Cylinder类，P68程序3.9
 */
public class StaticApp2 {
    public static void main(String[] args) {
        Cylinder.count();    //用类名调用static方法count，可以不用创建具体对象
        Cylinder volu1 = new Cylinder(3.5, 7);
        volu1.count();
        System.out.println("圆柱体1的体积=" + volu1.volume());
        Cylinder volu2 = new Cylinder(2.0, 3);
        Cylinder.count();       //volu2调用也可以
        System.out.println("圆柱体2的体积=" + volu2.volume());
    }
}
