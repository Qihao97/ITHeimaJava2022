package paragraph10.sec10_5;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:32 PM
 * @Descriptions: 10.12
 */
public class BankAccount {
    private double account_money;
    private String account_owner;

    public BankAccount(double money, String owner) {
        account_money = money;
        account_owner = owner;
    }

    public synchronized boolean deposit(double amt) {
        if (amt > 0) {
            System.out.println("帐户" + account_owner + "存款前余额为：" + account_money + "，正在存款:" + amt + ",请等待...");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            account_money += amt;
            System.out.println("存款成功,帐户" + account_owner + "的当前余额为：" + account_money);
            return true;
        }
        System.out.println("存款金额错误，存款失败");
        return false;
    }

    public synchronized boolean withdrawal(double amt) {
        if (amt > 0 && amt <= account_money) {
            System.out.println("帐户" + account_owner + "提款前余额为：" + account_money + "，正在提款:" + amt + ",请等待...");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            account_money -= amt;
            System.out.println("提款成功,帐户" + account_owner + "的当前余额为：" + account_money);
            return true;
        }
        System.out.println("提款金额错误，提款失败");
        return false;
    }
}
