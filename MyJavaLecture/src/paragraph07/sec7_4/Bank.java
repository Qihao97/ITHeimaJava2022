package paragraph07.sec7_4;

import javax.naming.InsufficientResourcesException;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 10:31
 * @Descriptions: 银行类，P183，程序7.12
 */
public class Bank {
    //    存款数
    private double balance;

    public double getBalance() {return this.balance;}

    public Bank(double balance) {
        this.balance = balance;
    }

    public void withdrawl(double dAmount)
            throws InsufficientFundsException {
        if (balance < dAmount) {
            throw new InsufficientFundsException(this, dAmount);
        }
        this.balance -= dAmount;
        this.showBalance();
        System.out.println("取款成功，感谢使用！");
    }

    public void showBalance() {
        System.out.println("The balance is " + (int) balance);
    }
}
