package section_02_oop.student;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/16/23:06
 * @Descriptions: 使用学生类
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.age = 25;
        student1.name = "林青霞";
        System.out.println("student1.age = " + student1.age + " student1.name = " + student1.name);

        student2 = student1;
        System.out.println("student1.age = " + student1.age + " student1.name = " + student1.name);
        System.out.println("student2.age = " + student2.age + " student2.name = " + student2.name);
    }
}
