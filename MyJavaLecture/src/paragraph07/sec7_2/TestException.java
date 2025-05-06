package paragraph07.sec7_2;

/**
 * @Author: Qihao
 * @Time: 2023/9/3 21:06
 * @Descriptions: P170，程序7.3
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
            try {
                System.out.println(demo[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting Index Value");
                System.out.println(e.toString());
                i = 5;
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                System.out.println("Welcome!");
            }
            i++;
        } // while循环结束
    } // 主函数main结束
}
