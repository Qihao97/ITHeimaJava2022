package paragraph02.demo003;

/**
 * @Author: Qihao
 * @Time: 2023/9/13/9:02
 * @Descriptions: 本类用来测试带有Static成员的Student类
 */
public class DemoTest01 {
    public static void main(String[] args) {
        System.out.println(Student.banji);
        Student student = new Student("1008", "lily", 'F', 18);
        Student.banji = 4;
        System.out.println(Student.banji);
        Student student2 = new Student("10028", "Jily", 'F', 18);
        System.out.println(student2.banji);

        DemoTest01 demo = new DemoTest01();
        demo.show();

    }

    public  void show(){
        System.out.println("这是一个方法！");
    }
}
