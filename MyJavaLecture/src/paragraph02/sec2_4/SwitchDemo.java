package paragraph02.sec2_4;

import java.util.Scanner;

/**
 * @Author: Qihao
 * @Time: 2023/8/29 16:42
 * @Descriptions: 分支示例之switch语句
 */
public class SwitchDemo {
    public static void main(String[] args) {
        //使用switch语句可以很方便的处理多分支
        System.out.println("请输入0到2之间的一个正整数：");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        switch(i){
            case 0:
                System.out.println("您输入的数字非常棒！");
                break;
            case 1:
                System.out.println("您能发大财！");
                break;
            case 2:
                System.out.println("中国发大财！");
                break;
            default:
                System.out.println("您很顺利！");
        }
    }
}
