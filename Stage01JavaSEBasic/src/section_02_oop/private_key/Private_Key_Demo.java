package section_02_oop.private_key;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/16/23:25
 * @Descriptions: private关键字示例
 */
public class Private_Key_Demo {
    public static void main(String[] args) {
        StudentPrivate studentPrivate1 = new StudentPrivate();
        System.out.println("name = " + studentPrivate1.getName() + "  age = " + studentPrivate1.getAge());

        System.out.println("------------------------------");

        studentPrivate1.setName("马尔扎哈");
        studentPrivate1.setAge(25);
        System.out.println("name = " + studentPrivate1.getName() + "  age = " + studentPrivate1.getAge());

        System.out.println("------------------------------");
        System.out.println("测试 toString函数：");
        System.out.println(studentPrivate1.toString());

    }
}
