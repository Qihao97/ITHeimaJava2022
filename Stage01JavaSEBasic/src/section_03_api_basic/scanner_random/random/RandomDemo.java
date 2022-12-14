package section_03_api_basic.scanner_random.random;

import java.util.Random;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/17/19:04
 * @Descriptions: Random类示例
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

//        获取[0,10）之间的随机整数
        int i = random.nextInt(10);
        System.out.println(i);

        System.out.println("--------------");

        for (int j = 0; j < 10; j++) {
            int r = random.nextInt(10);
            System.out.printf(r + "\t");
        }
        System.out.println();

//        获取1到100之间的整数
        int i1 = random.nextInt(100) + 1;
        System.out.println(i1);
    }
}
