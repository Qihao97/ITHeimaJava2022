package currency_count;

import java.math.BigDecimal;

/**
 * @Author: Qihao
 * @Time: 2022/11/15/20:41
 * @Descriptions:借记卡
 */
public class DebitCard {
//    活期余额
    BigDecimal currentDeposit;

//    定期余额
    BigDecimal timeDeposit;

    public BigDecimal getCurrentDeposit() {
        return currentDeposit;
    }

    public void setCurrentDeposit(BigDecimal currentDeposit) {
        this.currentDeposit = currentDeposit;
    }

    public BigDecimal getTimeDeposit() {
        return timeDeposit;
    }

    public void setTimeDeposit(BigDecimal timeDeposit) {
        this.timeDeposit = timeDeposit;
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "currentDeposit=" + currentDeposit +
                ", timeDeposit=" + timeDeposit +
                '}';
    }
}
