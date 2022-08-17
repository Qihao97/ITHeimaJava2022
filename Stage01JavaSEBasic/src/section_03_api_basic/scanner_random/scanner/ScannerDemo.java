package section_03_api_basic.scanner_random.scanner;

import java.util.Scanner;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/17/18:33
 * @Descriptions: Scanner类使用示例
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a int number: ");
        int i = scanner.nextInt();
        System.out.println("输入的数据为： " + i);
    }
}
