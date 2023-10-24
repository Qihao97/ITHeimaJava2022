package paragraph02.demo001;

/**
 * @Author: Qihao
 * @Time: 2023/9/13/8:15
 * @Descriptions: 本类用来演示Java中内存操作
 */
public class DemoTest02 {
    public static void main(String[] args) {
/*        int a = 10;
        int b = 10;
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        b = 100;
        System.out.println(System.identityHashCode(b));*/

        Student student = new Student();
        Student student1 = student;
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student.toString());
        System.out.println(student1.toString());

        student1.setInfo();
        System.out.println(student.toString());

        System.out.println("----------------------------");
        new Student().showInfo();   //匿名对象的使用

    }
}
