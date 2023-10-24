package paragraph06.demo01;

import java.util.Scanner;

/**
 * @Author: Qihao
 * @Time: 2023/9/20/16:01
 * @Descriptions: 演示数组
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //定义一个int类型的数组
//        boolean[] arr = new boolean[5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        //从键盘输入数字，进行数组的初始化
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        //输入数据，赋值给数组元素
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        //试图使用foreach修改数组元素
//        for (int t :
//                arr1) {
//            t = scanner.nextInt();
//        }

        //输出
//        arr1 = null;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
//        for (int temp: arr1) {
//            System.out.println(temp + 5);
//        }
    }
}
