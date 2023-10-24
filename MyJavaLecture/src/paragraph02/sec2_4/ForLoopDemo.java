package paragraph02.sec2_4;

/**
 * @Author: Qihao
 * @Time: 2023/9/6/9:09
 * @Descriptions: 演示for循环
 */
public class ForLoopDemo {
    static int [] arr = {1,2,3,4,5,6,7,8};

    public static void main(String[] args) {
//        for (int i = 0; i < 8; i++) {
//            System.out.println(arr[i]);
//        }

        for (int i:
             arr) {
            System.out.println(i);
        }
    }
}
