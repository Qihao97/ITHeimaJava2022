package paragraph06.sec6_2.array_demo;

import java.util.ArrayList;
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
        System.out.println(arrayList);
        arrayList = singleElement(arrayList);
        System.out.println(arrayList);
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
