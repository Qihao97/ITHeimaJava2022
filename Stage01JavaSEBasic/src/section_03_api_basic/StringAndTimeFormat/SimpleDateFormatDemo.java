package section_03_api_basic.StringAndTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author ：Qihao
 * @Time ：2022/11/07/9:39
 * @Description ：SimpleDateFormat示例
 * SimpleDateFormat类可用于日期的格式化和解析，即用字符串生成日期和日期转为字符串
 * 日期和时间格式由日期和时间模式字符串指定，在日期和时间模式字符串中，从'A'到'Z'以及从'a'到'z'的字母被解释为
 * 表示日期或时间字符串的组成部分的模式字母
 * 常用的模式字母对应关系如下：
 *      y   年
 *      M   月
 *      d   日
 *      H   时
 *      m   分
 *      s   秒
 * 构造方法：
 * SimpleDateFormat():  构造一个SimpleDateFormat,使用默认模式和日期模式
 * SimpleDateFormat(String pattern):  构造一个SimpleDateFormat，使用给定的模式和默认的日期格式
 * 格式化（从Date到String）
 * String format(Date date):将日期格式化为日期/时间字符串
 * 解析（从String到Date）
 * Date parse(String source):将给定的字符串解析为日期
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//        将日期按指定格式转为字符串，并且输出
        String date_to_str = simpleDateFormat.format(date1);
        System.out.println(date_to_str);

//        使用给定字符串创建日期，字符串中的模式和SimpleDateFormat中的模式要匹配上，否则不能解析
        String date_to_str2 = "2022年12月21日 12:23:59";
        Date parse = simpleDateFormat.parse(date_to_str2);
        System.out.println(parse);
    }
}
