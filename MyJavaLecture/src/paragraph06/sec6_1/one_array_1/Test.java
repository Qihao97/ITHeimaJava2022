package paragraph06.sec6_1.one_array_1;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 12:57
 * @Descriptions: 本类用来测试，带有主函数
 */
public class Test {
    public static void main(String[] args) {
        MyDate[] m;
        m = new MyDate[10];
        for (int i = 0; i < 10; i++) {
            m[i] = new MyDate(i + 1, i + 1, 1990 + i);
            m[i].display();
//            m = null;
        }
    }
}
