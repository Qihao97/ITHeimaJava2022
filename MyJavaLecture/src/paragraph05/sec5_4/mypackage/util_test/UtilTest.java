package paragraph05.sec5_4.mypackage.util_test;

import paragraph05.sec5_4.mypackage.util.Queue;
import paragraph05.sec5_4.mypackage.util.Stack;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 11:54
 * @Descriptions: 本类用于测试工具类Stack和Queue
 */
public class UtilTest {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new Queue<>();
        String[] strings = {"AA","BB","CC","DD","EE"};

        System.out.println("=============栈操作测试=============");
        for (int i =0;i<strings.length;i++){
            System.out.println("入栈： " + strings[i]);
            stringStack.push(strings[i]);
        }
        System.out.println("栈中共有：" + stringStack.totalEntrys() + " 项");

        while (stringStack.isEmpty() == false){
            System.out.println("出栈:" + stringStack.pop());
        }

        System.out.println("=============队列操作测试=============");
        for (int i = 0; i< strings.length;i++){
            System.out.println("入队列： " + strings[i]);
            stringQueue.in(strings[i]);
        }
        System.out.println("队列中共有： " + stringQueue.totalEntrys() + "项");

        while (stringQueue.isEmpty()==false){
            System.out.println("出队列： " + stringQueue.out());
        }
    }
}
