package paragraph06.sec6_1.one_array_2;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 13:08
 * @Descriptions: 书P136，程序6.3
 */
public class Date {
    int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
