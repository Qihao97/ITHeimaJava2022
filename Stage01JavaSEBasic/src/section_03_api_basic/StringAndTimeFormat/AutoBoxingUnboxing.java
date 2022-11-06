package section_03_api_basic.StringAndTimeFormat;

/**
 * @Author: Qihao
 * @Time: 2022/2022/11/5/23:43
 * @Descriptions:Java中的自动装箱和拆箱
 * 装箱： 把一个基本数据类型转换为包装类类型
 * 拆箱： 把包装类类型转换为基本数据类型
 */
public class AutoBoxingUnboxing {
    public static void main(String[] args) {
//        自动装箱示例，直接将基本数据类型赋值给其包装类
        Integer ii = 100;
//        上边一行实际在编译器中执行为： Integer ii = Integer.valueOf(100);

//        自动拆箱示例：直接使用包装类进行算数运算
        ii += 200;
        /**
         * 上边一行实际包含自动拆箱和装箱，在编译器中执行为：
         * ii = ii + 200;
         * ii = ii.intValue() + 200;
         * ii = 300;//ii = Integer.valueOf(300);
         */

        System.out.println(ii);

    }
}
