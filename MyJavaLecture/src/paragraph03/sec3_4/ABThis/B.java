package paragraph03.sec3_4.ABThis;

/**
 * @Author: Qihao
 * @Time: 2023/8/30 9:33
 * @Descriptions: Class B
 */
public class B {
    A a;
    public B(A a) {
        this.a = a;
    }

    public void print() {
        a.print();
        System.out.println("HelloAB from B!");
    }
}
