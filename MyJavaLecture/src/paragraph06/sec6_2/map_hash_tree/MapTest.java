package paragraph06.sec6_2.map_hash_tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Qihao
 * @Time: 2023/9/3 10:01
 * @Descriptions: 本类用来测试Student类，P160，程序6.14
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<Student, String> studentStringHashMap = new HashMap<>();
        studentStringHashMap.put(new Student("希林娜依", 25), "北京");
        studentStringHashMap.put(new Student("迪丽热巴", 31), "乌鲁木齐");
        studentStringHashMap.put(new Student("沙扬娜拉", 21), "杭州");
        studentStringHashMap.put(new Student("玛尔扎哈", 26), "青岛");
        studentStringHashMap.put(new Student("伊丽莎白", 22), "香港");

//        第一种取出方式keySet
        Set<Student> studentSet = studentStringHashMap.keySet();
        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            String address = studentStringHashMap.get(student);
            System.out.println("Student： " + student + ", 地址：" + address);
        }

//        第二种取出方式entrySet
        System.out.println("---------*****华丽的分割线*****---------");
        Set<Map.Entry<Student, String>> entrySet = studentStringHashMap.entrySet();
//        将映射关系存入Set集合
        Iterator<Map.Entry<Student, String>> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Student, String> next = iterator1.next();
            Student student = next.getKey();
            String address = next.getValue();
            System.out.println("Student： " + student + ", 地址：" + address);
        }
    }
}
