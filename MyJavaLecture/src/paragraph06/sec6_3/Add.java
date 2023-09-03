package paragraph06.sec6_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @Author: Qihao
 * @Time: 2023/9/3 11:44
 * @Descriptions: 本类用于操作Student对象，包括增加删除等
 */
public class Add {
    private ArrayList<Student> arrayList;
//    构造方法初始化arrayList

    public Add() {
        this.arrayList = new ArrayList<Student>();
    }

    //    向arrayList中添加Student对象
    public void add(Student student) {
        arrayList.add(student);
    }

    //    从arrayList中一处指定姓名的Student对象
    public void remove(String name) {
        Iterator<Student> iterator = this.arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) {
                iterator.remove();
                System.out.println("正在删除......");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
                    e.printStackTrace();
                }
                System.out.println("删除成功！");
                break;
            } else {
                System.out.println("正在匹配下一个人......");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
                    e.printStackTrace();
                }
            }
        }
    }

    public void showAll() {
        Student[] arrayStudents = this.arrayList.toArray(new Student[]{});
        Arrays.sort(arrayStudents);
        for (Student student : arrayStudents
        ) {
            System.out.println(student);
        }
    }
}
