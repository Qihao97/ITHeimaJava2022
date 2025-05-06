package paragraph03.sec3_3.studentTest;

/**
 * @Author: Qihao
 * @Time: 2023/8/30 8:51
 * @Descriptions: 本类带有主方法，用来使用Student类创建对象，并进行简单操作
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setStu("李雷","2023001",'M',20);
        student2.setStu("玛丽","2023002",'F',18);
        //调用成员变量
        System.out.println(student1.name + "同学的学号为： " + student1.no);

        System.out.println("------------华丽的分割线------------------");
        //调用成员方法
        student1.selfIntro();
    }
}
