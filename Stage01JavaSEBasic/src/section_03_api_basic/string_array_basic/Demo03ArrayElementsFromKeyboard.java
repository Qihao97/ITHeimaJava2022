package section_03_api_basic.string_array_basic;

import java.util.Scanner;

/**
 * @Author ：Qihao
 * @Time ：2022/11/07/13:56
 * @Description ：数组中的元素来自于键盘录入
 * 需求： 定义一个5个元素的int数组，数据来自于键盘录入，然后遍历输出数组元素
 *
 */
public class Demo03ArrayElementsFromKeyboard {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入五个整数：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("这五个数为：");
        for (int ii : arr
             ) {
            System.out.printf(ii + "\t");
        }
        System.out.println("\n---------------------------------");
        System.out.println("数组打印：");
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.printf("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.printf(String.valueOf(arr[i]));
            }else {
                System.out.printf(arr[i] + ",");
            }
        }
        System.out.printf("]");
    }
}
