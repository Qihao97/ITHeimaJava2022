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

        int i = random.nextInt(10);
        System.out.println(i);

        System.out.println("--------------");

        for (int j = 0; j < 10; j++) {
            int r = random.nextInt(10);
            System.out.printf(r + "\t");
        }
        System.out.println();
    }
}
