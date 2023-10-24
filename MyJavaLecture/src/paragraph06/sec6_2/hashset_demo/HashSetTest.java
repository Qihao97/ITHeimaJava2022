package paragraph06.sec6_2.hashset_demo;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 17:55
 * @Descriptions: 本类用于测试HashSet集合
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("a1", 11));
        hashSet.add(new Person("a2", 12));
        hashSet.add(new Person("a3", 13));
        hashSet.add(new Person("a2", 12));
        hashSet.add(new Person("a4", 14));
        System.out.println("=================");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Person p = (Person) it.next();
            System.out.println(p.getName() + "::" + p.getAge());
        }
//        "A".equals("B");
    }
}
