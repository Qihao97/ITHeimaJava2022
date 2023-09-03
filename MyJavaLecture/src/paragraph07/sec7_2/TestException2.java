package paragraph07.sec7_2;

import java.lang.*;

/**
 * @Author: Qihao
 * @Time: 2023/9/3 21:08
 * @Descriptions: P172，程序7.5
 */
public class TestException2 {
    public int div(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage()); //⑩获取异常信息
        }
        return 0;
    }

    public static void main(String[] args) {
        TestException2 test = new TestException2();
        test.div(3, 0);
    }
}