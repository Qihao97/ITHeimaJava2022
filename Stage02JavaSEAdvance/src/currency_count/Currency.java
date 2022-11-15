package currency_count;

import java.math.BigDecimal;

/**
 * @Author: Qihao
 * @Time: 2022/11/15/20:35
 * @Descriptions:
 */
public class Currency {
    public static void main(String[] args) {
//        招商银行：
        CreditCard zhaoshangCredit = new CreditCard();
        zhaoshangCredit.setLines(new BigDecimal("40000.0"));
        zhaoshangCredit.setCost(new BigDecimal("141.43"));
        zhaoshangCredit.setCreditBalance(new BigDecimal("39858.57"));
        System.out.println("招商信用卡：");
        System.out.println(zhaoshangCredit.toString());;

//        中信银行
        CreditCard zhongxinCredit = new CreditCard();
        zhongxinCredit.setLines(new BigDecimal("45000.0"));
        zhongxinCredit.setCost(new BigDecimal("674.71"));
        zhongxinCredit.setCreditBalance(new BigDecimal("44325.29"));
        System.out.println("中信信用卡：");
        System.out.println(zhongxinCredit.toString());

//        广发
        CreditCard CGBCredit = new CreditCard();
        CGBCredit.setLines(new BigDecimal("10000.0"));
        CGBCredit.setCost(new BigDecimal("263.8"));
        CGBCredit.setCreditBalance(new BigDecimal("9736.2"));
        System.out.println("广发信用卡：");
        System.out.println(CGBCredit.toString());

        DebitCard CGBDebit = new DebitCard();
        CGBDebit.setTimeDeposit(new BigDecimal("1500.0"));
        CGBDebit.setCurrentDeposit(new BigDecimal("48.56"));
        System.out.println("广发借记卡：");
        System.out.println(CGBDebit.toString());

//        交通
        CreditCard BOCCredit = new CreditCard();
        BOCCredit.setLines(new BigDecimal("15000.0"));
        BOCCredit.setCost(new BigDecimal("1032.04"));
        BOCCredit.setCreditBalance(new BigDecimal("13835.21"));
        System.out.println("交通信用卡：");
        System.out.println(BOCCredit.toString());

        DebitCard BOCDebit = new DebitCard();
        BOCDebit.setCurrentDeposit(new BigDecimal("2146.88"));
        BOCDebit.setTimeDeposit(new BigDecimal("10000.0"));
        System.out.println("交通借记卡：");
        System.out.println(BOCDebit.toString());

//        银联
        DebitCard unionPayDebit = new DebitCard();
        unionPayDebit.setCurrentDeposit(new BigDecimal("3137.92"));
//        现金
        unionPayDebit.setTimeDeposit(new BigDecimal("600.0"));
        System.out.println("其他储蓄：");
        System.out.println(unionPayDebit.toString());

        System.out.println("--------------------");
        System.out.println("信用卡总欠款：");
        BigDecimal allLines = zhaoshangCredit.getLines().
                add(zhongxinCredit.getLines()).
                add(CGBCredit.getLines()).
                add(BOCCredit.getLines());
        BigDecimal allCreditBalance = zhaoshangCredit.getCreditBalance()
                .add(zhongxinCredit.getCreditBalance())
                .add(CGBCredit.getCreditBalance())
                .add(BOCCredit.getCreditBalance());
        BigDecimal allCreditCost = allLines.subtract(allCreditBalance);
        System.out.println(allCreditCost);

        System.out.println("总储蓄：");
        BigDecimal allTimeDeposit = CGBDebit.getTimeDeposit()
                .add(BOCDebit.getTimeDeposit())
                .add(unionPayDebit.getTimeDeposit());
        BigDecimal allCurrentDeposit = BOCDebit.getCurrentDeposit()
                .add(unionPayDebit.getCurrentDeposit());
        BigDecimal allDeposit = allCurrentDeposit.add(allTimeDeposit);
        System.out.println(allDeposit);

        //        京东和美团欠款
        BigDecimal jingdongCost = new BigDecimal("18600.0")
                .subtract(new BigDecimal("18315.36"));
        BigDecimal meituanCost = new BigDecimal("58.9");
        BigDecimal allCost = jingdongCost.add(meituanCost);

        System.out.println("净资产：");
        BigDecimal netEstate = allDeposit
                .subtract(allCreditCost)
                .subtract(allCost);
        System.out.println(netEstate);

        System.out.println("带公积金净资产：");
        BigDecimal gongJiJin = new BigDecimal("1172.0")
                .add(new BigDecimal("1452.0"))
                .add(new BigDecimal("2000.0"));
        BigDecimal netEstateWithGongjijin = netEstate.add(gongJiJin);
        System.out.println(netEstateWithGongjijin);



    }
}
