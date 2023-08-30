package paragraph03.sec3_4.ABThis;

/**
 * @Author: Qihao
 * @Time: 2023/8/30 9:35
 * @Descriptions: 本类用于创建A和B的对象，
 */
public class HelloA {
    public static void main(String[] args) {
        A aa = new A();
        aa.print();
        B bb = new B(aa);
        bb.print();
    }
}
