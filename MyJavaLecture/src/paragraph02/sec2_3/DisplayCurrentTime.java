package paragraph02.sec2_3;

/**
 * @Author: Qihao
 * @Time: 2023/8/29 15:49
 * @Descriptions: TODO
 */
public class DisplayCurrentTime {
    public static void main(String[] args) {
        //获取从1970年1月1日零时到目前的总毫秒数
        long allMilliseconds = System.currentTimeMillis();

        //除以1000，得到从1970年1月1日零时到当前时刻的总秒数，取整
        long allSeconds = allMilliseconds/100;
        //计算当前时间的秒数
        long currentSecond = allSeconds % 60;
        //计算从1970年1月1日零时到当前时刻的总分钟数
        long allMinutes = allSeconds / 60;
        //计算当前时刻的分钟数
        long currentMinute = allMinutes % 60;
        //计算从1970年1月1日零时到当前时刻的总小时数
        long allHours = allMinutes / 60;
        //计算当前时刻的小时数
        long currentHour = allHours % 24;

        //输出当前时间
        System.out.println("The current time(UTC) is: " + currentHour + ":" + currentMinute + ":" + currentSecond);
        currentHour = (currentHour + 8) % 24;
        System.out.println("The current time(Beijing) is: " + currentHour + ":" + currentMinute + ":" + currentSecond);

        int a = 0x12;
        int b = 0xffffffff;
        int c = a&b;
        System.out.println(Integer.toHexString(c));
    }
}
