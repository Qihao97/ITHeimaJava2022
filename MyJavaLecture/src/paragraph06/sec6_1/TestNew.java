package paragraph06.sec6_1;

/**
 * @Author: Qihao
 * @Time: 3/24/2025 2:58 PM
 * @Descriptions: 程序6.1
 */
public class TestNew {
    public static void main(String[] args) {
        int s[];
        int i;
        s = new int[5];
        for (int j = 1; j <= 5; j++) {
            s[j-1] = j;
        }
        for (int i1:s) {
//            i1 = 9;
            System.out.println(i1);
        }
        System.out.println(s[3]);
    }
}
