package paragraph06.sec6_2.array_demo;

import paragraph02.demo004.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 17:41
 * @Descriptions: 本类用于演示ArrayList集合，P147.程序6.7
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");
        Student student = new Student();
        arrayList.add(student);
        arrayList.add(1);
        System.out.println(arrayList);
//        Arrays.toString(arrayList);
//        arrayList = singleElement(arrayList);
        System.out.println(arrayList);

        System.out.println("===============");
        System.out.println("获取长度：");
        System.out.println(arrayList.size());

//        System.out.println("===============");
//        System.out.println("删除元素");
//        arrayList.remove("B");
//        System.out.println(arrayList);
//        arrayList.clear();
//        System.out.println(arrayList);

        System.out.println("===============");
        arrayList.add("C");
        if (arrayList.contains("C")) {
            System.out.println("在");
        } else {
            System.out.println("不在");
        }
//        boolean b = arrayList.contains("C");
//        System.out.println(b);
//        System.out.println(arrayList.contains("C"));
        System.out.println("===============");
        if (arrayList.isEmpty()) {
            System.out.println("空集合");
        } else {
            System.out.println("非空集合");
        }

        System.out.println("===============");
        System.out.println("获取交集");
        System.out.printf("arrayList: ");
        System.out.println(arrayList);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");
        arrayList1.add("E");
        System.out.printf("arrayList1: ");
        System.out.println(arrayList1);
        System.out.println("取交集");
        System.out.println(arrayList.retainAll(arrayList1));
        System.out.println(arrayList);

        if (arrayList.add("V")) {
            System.out.println("添加成功");
        }

        System.out.println("===============");
        System.out.println("使用Iterator对象进行集合的遍历");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }


    }

    public static ArrayList singleElement(ArrayList arrayList) {
        //定义一个临时容器。
        ArrayList newArrayList = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (!newArrayList.contains(obj))
                newArrayList.add(obj);
        }
        return newArrayList;
    }
}
