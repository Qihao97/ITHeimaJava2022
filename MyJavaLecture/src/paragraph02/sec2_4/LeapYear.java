package paragraph02.sec2_4;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.Scanner;

/**
 * @Author: Qihao
 * @Time: 2023/8/29 16:31
 * @Descriptions: 书上37页程序2.5，用户输入年份，程序判断是否是闰年
 */
public class LeapYear {
    public static void main(String[] args) {
        //让用户输入年份
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份(正整数)：");
        int year = input.nextInt();
        //调用方法判断是否是闰年
        if (isLeapYear(year)){
            System.out.println(year + "is leap year!");
        }
        else {
            System.out.println(year + "is not a leap year!");
        }
    }
    //判断闰年逻辑
    public static boolean isLeapYear(int year){
        boolean leap = false;
        leap = (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
        return leap;
    }
}
