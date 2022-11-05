package section_03_api_basic.StringAndTimeFormat;

/**
 * @Author: Qihao
 * @Time: 2022/2022/11/5/18:06
 * @Descriptions:Integer包装类示例1
 * 构造方法：
 *    Integer(int value);       根据int数字创建Integer对象（过时）
 *    Integer(String str);      根据String字符串创建对象（过时）
 * 成员方法：
 *    static Integer valueOf(int i);        返回指定的int值的Integer对象
 *    static Integer valueOf(String str);   根据String字符串返回一个指定的Integer对象
 *
 * String对象和int类型的相互转换：
 * int转String
 *    方法一： int类型加上一个空的字符串：
 *          int number = 100;
 *          String s1 = number + "";
 *    方法二：String类调用valueOf(int数据类型);
 *    static String valueOf(int i),该方法是String类中的方法
 *          int i = 100;
 *          String s = String.valueOf(i);
 *  String对象转Integer对象：
 *        String str = "100";
 *        Integer integer = Integer.valueOf(str);
 *  String对象转int数据类型：
 *     方法一：
 *        int i = str.intValue();
 *     方法二：
 *     static int parseInt(String str), 将字符串解析为int类型，该方法是Integer类中的方法
 *        int i = Integer.parseInt(str);
 *
 *
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
//        用两个构造方法分别创建Integer对象，已过时
        Integer integer1 = new Integer(100);
        System.out.println(integer1);
        Integer integer2 = new Integer("100");
        System.out.println(integer2);

//        使用静态成员方法创建Integer对象，推荐
        Integer integer3 = Integer.valueOf(100);
        System.out.println(integer3);
        Integer integer4 = Integer.valueOf("100");
        System.out.println(integer4);

//        String对象和int类型数据的相互转换
        int i = 100;
//        将i转换为String字符串
        String s1 = i + "";
        String s2 = Integer.valueOf(i).toString();
        System.out.println(s2);
//        将int类型的数据转为String对象
        String s3 = String.valueOf(i);

        System.out.println("---------*****---------");
//        将String对象转为Integer对象
        String strInt = "100";
        Integer strToInteger = Integer.valueOf(strInt);
//        将Integer对象转为int类型数据
        int ii1 = strToInteger.intValue();
        System.out.println(ii1);
        int ii2 = Integer.parseInt(strInt);
        System.out.println(ii2);
    }
}
