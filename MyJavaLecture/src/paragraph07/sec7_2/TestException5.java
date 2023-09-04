package paragraph07.sec7_2;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 9:15
 * @Descriptions: P175，程序7.8
 */
public class TestException5 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        try {
            int x = demo.div(5, 0);
            System.out.println("x = " + x);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.toString());
            System.out.println("被零除了！");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println(arrayIndexOutOfBoundsException.toString());
            System.out.println("数组下标越界了！");
        } catch (Exception exception) {
            System.out.println("异常信息: " + exception.toString());
        }
        System.out.println("Over!");
    }
}
