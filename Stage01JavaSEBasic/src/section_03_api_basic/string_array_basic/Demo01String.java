package section_03_api_basic.string_array_basic;

/**
 * @Author ：Qihao
 * @Time ：2022/11/07/11:19
 * @Description ：String测试
 * String类用来表示字符串，Java中所有的字符串文字，例如"ABC"等，都实现为此类的实例
 * 构造方法：
 * String(): 初始化新创建的String对象，使其表示空字符序列
 * String(String original): 初始化新创建的String对象，使其表示与参数相同的字符序列
 */
public class Demo01String {
    public static void main(String[] args) {
//        使用无参构造函数创建String对象
        String str1 = new String();
        System.out.println(str1);
//        输出str1的长度
        System.out.println(str1.length());

//        使用带参数的构造函数创建String对象
        String str2 = new String("This is a String object.");
        System.out.println(str2);
        System.out.println(str2.length());
    }
}
