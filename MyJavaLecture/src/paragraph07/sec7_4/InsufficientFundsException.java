package paragraph07.sec7_4;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 10:36
 * @Descriptions: 本类用于判断余额不足
 */
public class InsufficientFundsException extends Exception {
    private Bank excepBank;     //银行对象
    private double excepAmount;     //要取的钱

    public InsufficientFundsException(Bank excepBank, double excepAmount) {
        this.excepBank = excepBank;
        this.excepAmount = excepAmount;
    }

    public String exceptMessage() {
        String str = "您的账户余额为：" + excepBank.getBalance()
                + "\n" + "您的取款金额为： " + excepAmount + "\n" + "取款金额大于账户余额，您的余额不足，操作不合法！";
        return str;
    }
}
