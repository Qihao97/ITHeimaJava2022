package section_03_api_basic.StringAndTimeFormat;

import java.util.Date;

/**
 * @Author ：Qihao
 * @Time ：2022/11/07/9:26
 * @Description ：Date类示例
 * Date类表示特定的时刻，精度为毫秒
 * 构造方法：
 *    Date(): 分配Date对象并对其进行初始化，使其表示分配时间，时间精确到毫秒
 *    Date(long date): 分配Date对象并初始化它，以表示自标准基准时间以来的指定毫秒数，基准时间为1970年1月1日00:00:00（格林尼治时间）
 */
public class DateDemo {
    public static void main(String[] args) {
//        Date(): 分配Date对象并对其进行初始化，使其表示分配时间，时间精确到毫秒
        Date date1 = new Date();
        System.out.println(date1);

//        Date(long date): 分配Date对象并初始化它，以表示自标准基准时间以来的指定毫秒数，基准时间为1970年1月1日00:00:00（格林尼治时间）
        Date date2 = new Date(1000 * 60 * 60 * 12);
        System.out.println(date2);      //该事件输出为北京时间

    }
}
