package paragraph06.demo01;

/**
 * @Author: Qihao
 * @Time: 2023/9/20/16:42
 * @Descriptions: 第二维长度不一样的二维数组
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
//        int[][] arr2 = new int[3][];
//        int[] a = new int[10];
//        arr2[0] = new int[3];
//        arr2[1] = new int[2];
//        arr2[2] = new int[5];
//        arr2[2] = a;

        //对象数组
        Dog[][] dogsss = new Dog[3][5];

        int[][] array2 = {{1,2,3},{4,5,6}};

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j]);
            }
        }

        int count = 0;
//        求二维数组的元素个数
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
//                System.out.println(array2[i][j]);
                count ++;
            }
        }

//        foreach 遍历
        for (int[] temp :
                array2) {
            for (int e :
                    temp) {
                System.out.println(e);
            }
        }
    }
}
