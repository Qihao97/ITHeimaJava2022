package paragraph06.sec6_1.one_array_2;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 13:12
 * @Descriptions: 书P137，程序6.4
 */
public class TestS {
    public static void main(String[] args) {
        int a[] = {0, 1, 2};
        Time times[] = {new Time(19, 42, 42), new Time(1, 23, 54), new Time(5, 3, 2)};

        for (int i = 0; i < times.length; i++) {
            System.out.println(times[i]);
        }
    }
}
