package test;

import java.math.BigDecimal;
/**
 * 该算法用来求解类似于令S = 1! + 2! + 3! + ::: + 202320232023!，求S 的末尾9 位数字。
 * 提示：答案首位不为0。
 * 的问题。该问题 出现于2023年春季蓝桥杯Java试题第一题
 * 解题方法： 当算到40的阶乘的时候，以后每个数的阶乘末尾9位数都为0，不影响求和后的后9位
 * 因此只需要求和前40的阶乘即可。
 * 后续遇到这种题，求末尾若干位，则选取一个较大的数，如果两个连续整数算出的结果一致，则该结果就是答案。
 * */
public class BigNumFactor {
    public static void main(String[] args) {

       BigDecimal count = new BigDecimal("1");
       BigDecimal preFactor = new BigDecimal("1");
       BigDecimal factor = new BigDecimal("1");

       BigDecimal step = new BigDecimal("1");
        for (long i = 1; i < 2023; i++) {
            BigDecimal ii = new BigDecimal(i);
            factor = preFactor.multiply(ii);
            preFactor = factor;
            count = count.add(factor);
        }
        System.out.println(count.toString());
        System.out.println("-------********----------");
        System.out.println(count.toString().substring(count.toString().length()-9));
    }
}
