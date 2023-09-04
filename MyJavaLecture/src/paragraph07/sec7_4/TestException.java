package paragraph07.sec7_4;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 10:44
 * @Descriptions: 测试类，P183，程序7.12
 */
public class TestException {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank(50);
            bank.withdrawl(100);
            System.out.println("取款不成功，请下次再来！");
        } catch (InsufficientFundsException e) {
            System.out.println(e.toString());
            System.out.println(e.excepMessage());
        }
    }
}
