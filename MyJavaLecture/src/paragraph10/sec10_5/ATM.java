package paragraph10.sec10_5;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:34 PM
 * @Descriptions: 10.12
 */
public class ATM implements Runnable {
    Thread t;
    BankAccount ATMAccount;  //ATM机上操作的帐户对象
    double ATMMoney;   //ATM机上存款或提款金额
    String ATMOperateType;   //操作类别：存款或取款

    public ATM(BankAccount acct, String type, double money) {
        t = new Thread(this);   //创建线程，由Java自动提供线程名
        ATMAccount = acct;
        ATMOperateType = type;
        ATMMoney = money;
        t.start();
    }

    @Override
    public void run() {
        if (ATMOperateType.equals("deposit"))  //不同操作类别调用不同方法
            ATMAccount.deposit(ATMMoney);
        else if (ATMOperateType.equals("withdrawal"))
            ATMAccount.withdrawal(ATMMoney);
    }
}
