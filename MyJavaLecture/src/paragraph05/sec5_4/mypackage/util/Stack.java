package paragraph05.sec5_4.mypackage.util;

import java.util.ArrayList;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 11:37
 * @Descriptions: 本类用于实现工具包中的Stack类
 */
public class Stack<T> {
    private int curIndex = -1;
    ArrayList<T> list;

    public Stack() {
        list = new ArrayList<T>();
    }

    public void push(T object) {
        list.add(object);
        curIndex++;
    }

    public T pop() {
        T object = null;
        if (list.isEmpty() || curIndex < 0) {
            return null;
        } else {
            object = list.get(curIndex);
            list.remove(curIndex);
            curIndex--;
            return object;
        }
    }

    public boolean isEmpty() {
        boolean res = false;
        if (curIndex < 0) {
            res = true;
        }
        return res;
    }

    public int totalEntrys() {
        return (curIndex + 1);
    }
}
