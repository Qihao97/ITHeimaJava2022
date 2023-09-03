package paragraph06.sec6_2.treeset_demo2;

import java.util.Comparator;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 18:14
 * @Descriptions: 本类重写了Comparator接口中的compare方法，使字符串能够按长度来排序
 */
public class StrLenComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));
        /*也可以使用这段代码代替上一句语句
        if(s1.length() > s2.length())
            return 1;
        if(s1.length() == s2.length())
            return 0;
            */
        if (num == 0)
            return s1.compareTo(s2);
        return num;
    }
}
