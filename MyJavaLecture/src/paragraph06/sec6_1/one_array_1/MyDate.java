package paragraph06.sec6_1.one_array_1;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 12:55
 * @Descriptions: 书P135，程序6.2
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void display() {
        System.out.println(day + "-" + month + "-" + year);
    }
}
