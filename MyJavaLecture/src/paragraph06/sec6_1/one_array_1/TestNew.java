package paragraph06.sec6_1.one_array_1;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 12:52
 * @Descriptions: 书P135，程序6.1
 */
public class TestNew {
    public static void main(String[] args) {
        int[] s;
        int i;
        s = new int[5];
        for (i = 0; i < 5; i++) {
            s[i] = i;
        }

        for (i = 4; i >= 0; i--) {
            System.out.println("" + s[i]);
        }
    }
}
