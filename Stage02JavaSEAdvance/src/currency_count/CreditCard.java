package currency_count;

import java.math.BigDecimal;

/**
 * @Author: Qihao
 * @Time: 2022/11/15/20:36
 * @Descriptions:信用卡
 */
public class CreditCard {
//    信用卡额度
    BigDecimal lines;
//    信用卡已使用额度
    BigDecimal cost;

//    信用卡剩余额度
    BigDecimal creditBalance;

    public BigDecimal getLines() {
        return lines;
    }

    public void setLines(BigDecimal lines) {
        this.lines = lines;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(BigDecimal creditBalance) {
        this.creditBalance = creditBalance;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "lines=" + lines +
                ", cost=" + cost +
                ", creditBalance=" + creditBalance +
                '}';
    }
}
