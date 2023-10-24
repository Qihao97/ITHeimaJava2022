package paragraph02.demo001;

/**
 * @Author: Qihao
 * @Time: 2023/9/6/16:34
 * @Descriptions: 演示Student类
 */
public class DemoTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setInfo();
        Student student1 = student;
        if (student == student1){
            System.out.println("student和student1相等");
        }

        System.out.println("---------华丽的分割线----------");
        Student student2 = new Student();
        student2.setInfo();
        if (student2.equals(student)){
            System.out.println("内容一样，两者相等！");
        }

//        student.showInfo();

//        System.out.println("---------华丽的分割线----------");
//        student.ID = "2023000001";
//        student.name = "Jack";
//        student.gender
    }
}
