package paragraph05.sec5_4.mypackage.util;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 11:45
 * @Descriptions: 本类用于实现工具包中的Queue类
 */
public class Queue<T> {
    class Item {
        T entry;
        Item next;
    }

    private Item head = null, cursor = null;
    private int itemNum = 0;

    public Queue() {

    }

    public void in(T object) {
        Item item = new Item();
        item.entry = object;
        item.next = null;
        if (head == null && cursor == null) {
            head = item;
            cursor = item;
        } else {
            cursor.next = item;
            cursor = item;
        }
        itemNum++;
    }

    public T out() {
        if (head != null || itemNum != 0) {
            Item temp = head;
            head = head.next;
            itemNum--;
            return temp.entry;
        }
        return null;
    }

    public int totalEntrys() {
        return itemNum;
    }

    public boolean isEmpty() {
        if (itemNum == 0) {
            return true;
        } else {
            return false;
        }
    }
}
