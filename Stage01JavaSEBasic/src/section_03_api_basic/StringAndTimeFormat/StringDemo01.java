package section_03_api_basic.StringAndTimeFormat;

/**
 * @Author: Qihao
 * @Time: 2022/2022/11/4/10:28
 * @Descriptions:简介String
 * String类的成员方法：
 * int length();        //返回此字符串的长度
 * boolean equals(Object anObject);     //比较字符串
 * boolean equalsIgnoreCase(String anotherString);      //忽略大小写的比较
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String string1 = "itHeima";
        String string2 = "itHeima";
        String string3 = "ItHeima";

        System.out.println("字符串长度：");
        System.out.println(string1.length());
        System.out.println("比较字符串:");
        System.out.println(string1.equals(string2));
        System.out.println("比较字符串:");
        System.out.println(string1.equals(string3));
        System.out.println("忽略大小写的比较：");
        System.out.println(string1.equalsIgnoreCase(string3));
        System.out.println("itHeima".equalsIgnoreCase(string3));

        System.out.println("演示去除前后空格：");
        String string = "    Henan Zhengzhou Longzihu.       ";
        System.out.println("原字符串：\n" + string);
        System.out.println("去除前后空格后的字符串：\n" + string.trim());
    }
}
