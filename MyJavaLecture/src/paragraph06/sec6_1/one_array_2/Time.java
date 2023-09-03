package paragraph06.sec6_1.one_array_2;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 13:14
 * @Descriptions: 书，P137，程序6.4
 */
public class Time {
    int hour,min,sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", min=" + min +
                ", sec=" + sec +
                '}';
    }
}
