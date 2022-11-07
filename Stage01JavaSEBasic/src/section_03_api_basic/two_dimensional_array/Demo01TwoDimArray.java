package section_03_api_basic.two_dimensional_array;

/**
 * @Author ：Qihao
 * @Time ：2022/11/07/14:41
 * @Description ：二维数组概述
 * 二维数组： 元素为一维数组的数组
 * 定义格式：
 *    格式一： int[][] arr;
 *    格式二： int arr[][];
 *
 * 二维数组的静态初始化：
 *    数据类型[][] 变量名 = new 数据类型[][]{{elements},{elements},{elements}...};
 *    简化格式： 数据类型[][] 变量名 = {{elements},{elements},{elements}...};
 *    注意：在二维数组中，每个一维数组的元素个数可以不同
 * 二维数组的动态初始化：
 *    格式： 数据类型[][] 变量名 = new 数据类型[m][n];
 *    定义了一个二维数组，该二维数组由m个一维数组构成，每个一维数组可以有n个元素
 */
public class Demo01TwoDimArray {
    public static void main(String[] args) {
//        二维数组静态初始化示例
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};

//        使用foreach遍历二维数组
        for (int[] arr:arr1
             ) {
            for (int arr_2:arr
                 ) {
                System.out.printf(arr_2 + "\t");
            }
        }

        System.out.println("使用方法遍历二维数组：");
        printTwoDimArray(arr1);
    }

    public static void printTwoDimArray(int[][] array){
        System.out.printf("{");
//        array.length表示该二维数组中有几个一维数组
        for (int i = 0; i < array.length; i++) {
            System.out.printf("{");
            for (int j = 0; j < array[i].length; j++) {
//                array[i].length 表示该一维数组中有几个元素
                if (j == (array[i].length - 1)){
                    System.out.printf(array[i][j] + "");
                    System.out.printf("}");
                }else {
                    System.out.printf(array[i][j] + ",");
                }
            }
            if (i == (array.length - 1)){
                System.out.printf("}");
            }else {
                System.out.printf(",");
            }
        }
    }
}
