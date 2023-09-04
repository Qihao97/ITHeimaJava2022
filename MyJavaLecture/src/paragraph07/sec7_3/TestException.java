package paragraph07.sec7_3;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 10:19
 * @Descriptions: P181, 程序7.11
 */
public class TestException {
    public static void firstException() throws MyFirstException {
        throw new MyFirstException("\"firstException()\"method occurs an exception!");
    }

    public static void secondException() throws MySecondException {
        throw new MySecondException("\"secondException()\"method occurs an exception!");
    }

    public static void main(String[] args) {
        try {
            TestException.firstException();
            TestException.secondException();
        } catch (MyFirstException e1) {
            System.out.println("Exception: " + e1.getMessage());
            e1.printStackTrace();
        } catch (MySecondException e2) {
            System.out.println("Exception: " + e2.getMessage());
            e2.printStackTrace();
        }
    }
}
