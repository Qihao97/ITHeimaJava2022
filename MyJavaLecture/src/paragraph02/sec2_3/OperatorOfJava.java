package paragraph02.sec2_3;

/**
 * @Author: Qihao
 * @Time: 2023/8/29 15:30
 * @Descriptions: 本例演示Java中的
 */
public class OperatorOfJava {
    public static void main(String[] args) {
        //自增和自减运算符
        System.out.println("---------***自增和自减运算符***---------");
        int i = 1;
        int i1 = i++;
        System.out.println(i1);
        System.out.println(i);
        i = 1;
        int i2 = ++i;
        System.out.println(i2);

        System.out.println("---------***自增和自减运算符***---------");
        System.out.println(Integer.MAX_VALUE);      //输出最大整数
        System.out.println(Integer.MIN_VALUE);      //输出最小整数
        System.out.println(Float.MAX_VALUE);        //输出最大单精度数
        System.out.println(Float.MIN_VALUE);        //输出最小单镜度数
        System.out.println(Double.MAX_VALUE);        //输出最大双精度数
        System.out.println(Double.MIN_VALUE);        //输出最小双镜度数
    }
}
