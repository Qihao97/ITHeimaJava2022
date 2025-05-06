package paragraph06.sec6_2.map_demo;

import paragraph06.sec6_2.array_demo2.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 18:28
 * @Descriptions: Map集合的两种遍历方式
 */
public class MapDemo1 {
    public static void main(String[] args) {
        System.out.println("使用keySet()进行遍历");
        Map<Person, Integer> map = new HashMap<Person, Integer>();
        map.put(new Person("张三01", 20), 80);
        map.put(new Person("张三02", 22), 84);
        map.put(new Person("张三03", 24), 89);

//        将map中的键存入名为keySet的set集合
        Set<Person> keySet = map.keySet();
        Iterator<Person> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println(p + "-" + map.get(p));
        }

        System.out.println("---------*****华丽的分割线*****---------");
        System.out.println("使用entrySet()进行遍历：");
        Map<Person, Integer> integerMap = new HashMap<>();
        integerMap.put(new Person("李四001", 18), 90);
        integerMap.put(new Person("李四002", 20), 93);
        integerMap.put(new Person("李四003", 19), 96);

//        将映射关系存入名为entrySet的集合
//        Set<Map.Entry<Person, Integer>> entrySet = map.entrySet();
        Set<Map.Entry<Person, Integer>> entrySet = map.entrySet();
//        Iterator<Map.Entry<Person, Integer>> iterator1 = entrySet.iterator();
        Iterator<Map.Entry<Person, Integer>> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Person, Integer> entry = iterator1.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
