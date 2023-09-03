package paragraph06.sec6_2.linkedlist_demo;

import java.util.LinkedList;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 17:53
 * @Descriptions: 本类用于测试LinkedList集合的方法使用，P150，程序6.9
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.addLast("A");
        link.addLast("B");
        link.addLast("C");
        link.addLast("D");
        System.out.println(link);// [A, B, C, D]
        System.out.println(link.getFirst());//A
        System.out.println(link.getLast());//D
        System.out.println(link.removeFirst());//A
        System.out.println(link.removeFirst());//B
        System.out.println("size=" + link.size());//size=2
        while (!link.isEmpty()) {
            System.out.println(link.removeLast());//D
        }

    }
}
