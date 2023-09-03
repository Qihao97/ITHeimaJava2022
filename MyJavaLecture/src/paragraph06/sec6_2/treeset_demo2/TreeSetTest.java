package paragraph06.sec6_2.treeset_demo2;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 18:18
 * @Descriptions: 本类用于测试，字符串按长度排序
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new StrLenComparator());
        treeSet.add("abcd");
        treeSet.add("cc");
        treeSet.add("cba");
        treeSet.add("aaa");
        treeSet.add("z");
        treeSet.add("hello");
        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
