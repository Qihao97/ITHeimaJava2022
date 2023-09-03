package paragraph06.sec6_2.array_demo2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 17:49
 * @Descriptions: 将Person对象存入ArrayList集合中，P148，程序6.8
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Person("zhang", 25));
        arrayList.add(new Person("wang", 32));
        arrayList.add(new Person("li", 30));
        arrayList.add(new Person("zhao", 33));
        arrayList.add(new Person("li", 30));
        arrayList = singleElement(arrayList);
        System.out.println("remove 03 :" + arrayList.remove(new Person("zhao", 33)));
//remove方法底层也是依赖于元素的equals方法。
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Person p = (Person) it.next();
            System.out.println(p.getName() + "::" + p.getAge());
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
