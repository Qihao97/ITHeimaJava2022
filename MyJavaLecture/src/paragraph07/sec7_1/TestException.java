package paragraph07.sec7_1;

/**
 * @Author: Qihao
 * @Time: 2023/9/2/23:19
 * @Descriptions: 测试Exception异常处理
 */
public class TestException {
    public static void main(String args[]) {
        int i = 0;

        String demo[] = {
                "Hello world!",
                "How are you!",
                "Good bye!"
        };

        while (i < 4) {
            System.out.println(demo[i]);
            i++;
        }
    }
}
