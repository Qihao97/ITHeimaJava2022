package paragraph06.sec6_2.treeset_demo;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 18:07
 * @Descriptions: 往TreeSet集合中存储自定义对象Student
 * 按学生的年龄进行排序，使用的是第一种方法，让元素自身具备比较性
 * 在Student类中实现了Comparable接口，覆盖了compareTo方法
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("lisi02", 22));
        treeSet.add(new Student("lisi007", 20));
        treeSet.add(new Student("lisi09", 19));
        treeSet.add(new Student("lisi08", 19));
        treeSet.add(new Student("lisi007", 20));
        treeSet.add(new Student("lisi01", 40));
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Student stu = (Student) iterator.next();
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
    }
}
