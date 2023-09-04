package paragraph07.sec7_2;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 9:53
 * @Descriptions: P179, 程序7.10，判断数字并捕获可能出现的三种异常
 */
public class Application7_9 {
    static void check(String str1) throws NullPointerException {
        if (str1.length() > 2) {
            str1 = null;
//            空字符串的长度
            System.out.println(str1.length());
        }
        char ch;
        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
//            判断参数中的字符是否为数字，如果不是则抛出数字格式异常
            if (!Character.isDigit(ch)) {
                throw new NumberFormatException();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int num;
        try {
            check(args[0]);
            num = Integer.parseInt(args[0]);
            if (num >= 60) {
                System.out.println("成绩为： " + num + "及格");
            } else {
                System.out.println("成绩为： " + num + "不及格");
            }
        } catch (NullPointerException e) {
            System.out.println("空指针异常：" + e.toString());
        } catch (NumberFormatException e) {
            System.out.println("输入的参数不是数值类型");
        } catch (Exception e) {
            System.out.println("命令行中没有提供参数");
        }
    }
}
