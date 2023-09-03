package paragraph06.sec6_1.one_array_2;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 13:05
 * @Descriptions: 书P136，程序6.3
 */
public class TestD {
    public static void main(String[] args) {
        int a[];
        a = new int[3];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        Date days[];
        days = new Date[3];
        days[0] = new Date(2008, 4, 5);
        days[1] = new Date(2008, 2, 28);
        days[2] = new Date(2008, 4, 6);

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i].toString());
        }
    }
}
