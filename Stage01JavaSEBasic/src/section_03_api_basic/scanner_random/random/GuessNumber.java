package section_03_api_basic.scanner_random.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/17/19:11
 * @Descriptions: 使用Random类实现一个猜数字游戏
 */
public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
//        随机产生一个[1,100]之间的整数
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要猜的数字：");
        int guessNumber = scanner.nextInt();

        if (guessNumber > number){
            System.out.println("您猜的数字大了");
        }else if (guessNumber < number){
            System.out.println("您猜的数字小了");
        }else {
            System.out.println("您猜对了");
        }
    }
}
