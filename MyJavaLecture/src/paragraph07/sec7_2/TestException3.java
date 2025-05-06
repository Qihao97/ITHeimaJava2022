package paragraph07.sec7_2;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 9:07
 * @Descriptions: P173, 程序7.6，throw,catch
 */
public class TestException3 {
    int x;

    public static void main(String[] args) {
        int y;
        TestException3 c = new TestException3();
        try {
            y = 3 / c.x;
            if (c.x == 0) {
//                throw new Exception("被零除！");
                throw new Exception();
            }
        } catch (ArithmeticException e) {
            System.out.println("divide by zero error!");
            System.out.println(e.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Program ends ok!");
    }
}
