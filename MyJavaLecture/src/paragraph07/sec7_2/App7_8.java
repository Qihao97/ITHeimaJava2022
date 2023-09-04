package paragraph07.sec7_2;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 9:38
 * @Descriptions: P177, 程序7.9，求阶乘并捕获可能出现的三种异常
 */
public class App7_8 {
    public static double multi(int n) {
        if (n < 0)
            throw new IllegalArgumentException("求负数阶乘异常");
        double s = 1;
        for (int i = 1; i <= n; i++) {
            s = s * i;
        }
        return s;
    }

    public static void main(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            System.out.println(m + "! = " + multi(m));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("命令行中没提供参数！");
        } catch (NumberFormatException e) {
            System.out.println("应当输入一个整数！");
        } catch (IllegalArgumentException e) {
            System.out.println("出现的异常是： " + e.toString());
        } finally {
            System.out.println("程序运行结束！");
        }
    }
}
