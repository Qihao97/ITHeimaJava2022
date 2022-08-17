package section_03_api_basic.scanner_random.scanner;

import java.util.Scanner;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/17/18:38
 * @Descriptions: Scanner类的基本使用，使用Scanner对象从键盘输入两个整数并输出二者的和
 */
public class ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println("输入的两个整数为：" + i + '\t' + j);
        System.out.println("这两个整数的和为： " + sum(i, j));
    }

    public static int sum(int a, int b){
        return (a + b);
    }
}
