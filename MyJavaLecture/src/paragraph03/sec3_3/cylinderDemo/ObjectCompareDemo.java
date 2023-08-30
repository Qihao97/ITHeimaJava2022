package paragraph03.sec3_3.cylinderDemo;

/**
 * @Author: Qihao
 * @Time: 2023/8/30 9:08
 * @Descriptions: 本类使用Cylinder类创建对象，进行对象的比较
 */
public class ObjectCompareDemo {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(2.0, 3);
        Cylinder cylinder2 = new Cylinder(2.0, 3);
        Cylinder cylinder3 = cylinder1;
        cylinder1.compare(cylinder2);   //不相等
        cylinder1.compare(cylinder3);   //相等
    }
}
