package paragraph10.sec10_5;

/**
 * @Author: Qihao
 * @Time: 11/1/2023 3:35 PM
 * @Descriptions: 10.12
 */
public class ThreadATM {
    public static void main(String args[]) {
        BankAccount jack = new BankAccount(1000, "jack");
        ATM user_deposit = new ATM(jack, "deposit", 200);
        ATM user_withdrawal = new ATM(jack, "withdrawal", 300);
        try {
            user_deposit.t.join();
            user_withdrawal.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
