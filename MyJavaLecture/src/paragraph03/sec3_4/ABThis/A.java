package paragraph03.sec3_4.ABThis;

/**
 * @Author: Qihao
 * @Time: 2023/8/30 9:32
 * @Descriptions: class A
 */
public class A {
    public A() {
        new B(this).print();
    }

    public void print() {
        System.out.println("HelloAA from A!");
    }
}
