package section_02_oop.constructor;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/16/23:51
 * @Descriptions: 学生类示例
 */
public class StudentDemo {
    public static void main(String[] args) {
        StudentConstructor studentConstructor = new StudentConstructor();
        StudentConstructor Dili = new StudentConstructor(25, "迪丽热巴");
        System.out.println(studentConstructor.toString());
        System.out.println(Dili.toString());
        Dili.setAge(26);
        Dili.setName("迪丽热巴·买买提");
        System.out.println(Dili.toString());
    }
}
