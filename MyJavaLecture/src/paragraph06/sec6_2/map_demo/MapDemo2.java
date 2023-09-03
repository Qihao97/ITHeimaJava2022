package paragraph06.sec6_2.map_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Qihao
 * @Time: 2023/9/3 9:08
 * @Descriptions: Map集合的两种遍历方式, P157,程序6.13
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("02", "张三2");
        map.put("03", "张三3");
        map.put("01", "张三1");
        map.put("04", "张三4");

//        将Map集合中的映射关系取出，存入Set集合中
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println("---------*****华丽的分割线*****---------");
//        先获取map集合的所有键的Set集合，keySet()
        Set<String> keySet = map.keySet();
//        然后获取该set集合的迭代器
        Iterator<String> iterator1 = keySet.iterator();
        while (iterator1.hasNext()) {
            String key = iterator1.next();
//            使用键来获取值
            String value = map.get(key);
            System.out.println("key: " + key + ", value: " + value);
        }
    }
}
