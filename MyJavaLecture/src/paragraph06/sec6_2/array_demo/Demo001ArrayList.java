package paragraph06.sec6_2.array_demo;

import paragraph06.sec6_3.Student;

import java.util.ArrayList;

/**
 * @Author: Qihao
 * @Time: 3/25/2025 4:22 PM
 * @Descriptions: 演示ArrayList
 */
public class Demo001ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
//        arrayList.add(new Student("1222","张三",88,99,89));
//        System.out.println("郑州".);
        arrayList.add("郑州");
        arrayList.add("武汉");
        arrayList.add("青岛");
        arrayList.add("杭州");
        arrayList.add("上海");
        arrayList.add("重庆");

        System.out.println(arrayList.size());
        System.out.println(arrayList);

        arrayList.remove("杭州");
        System.out.println(arrayList);
        System.out.println(arrayList.contains("郑州"));
    }
}
