package paragraph06.sec6_1.two_array;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 13:26
 * @Descriptions: 二维数组测试，P140，程序6.6
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 19, 32, 45};
        int index = getIndex_2(arr, 190);
        System.out.println("index=" + index);
    }

    //返回一个数在一个有序数组中插入的位置
    public static int getIndex_2(int[] arr, int key) {
        int min = 0, max = arr.length - 1, mid;
        while (min <= max) {
            mid = (max + min) >> 1;
            if (key > arr[mid])
                min = mid + 1;
            else if (key < arr[mid])
                max = mid - 1;
            else
                return mid;
        }
        return min;
    }

    /*
    折半的第二种方式。
    */
    public static int halfSearch_2(int[] arr, int key) {
        int min = 0, max = arr.length - 1, mid;
        while (min <= max) {
            mid = (max + min) >> 1;
            if (key > arr[mid])
                min = mid + 1;
            else if (key < arr[mid])
                max = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    /*
    折半查找。提高效率，但是必须要保证该数组是有序的数组。
    */
    public static int halfSearch(int[] arr, int key) {
        int min, max, mid;
        min = 0;
        max = arr.length - 1;
        mid = (max + min) / 2;
        while (arr[mid] != key) {
            if (key > arr[mid])
                min = mid + 1;
            else if (key < arr[mid])
                max = mid - 1;
            if (min > max)
                return -1;
            mid = (max + min) / 2;
        }
        return mid;
    }

    //定义功能，获取key第一次出现在数组中的位置。如果返回是-1，那么代表该key在数组中不存在。
    public static int getIndex(int[] arr, int key) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == key)
                return x;
        }
        return -1;
    }
}
