package paragraph02.demo003;

/**
 * @Author: Qihao
 * @Time: 2023/9/13/9:02
 * @Descriptions: 本类用来测试Static
 */
public class Student {
    public static int banji = 3;  //表示班级
    private String ID = "1001";
    private String name = "LiMing";
    private char gender = 'M';    //gender表示性别，M表示男性，F表示女性
    private int age = 20;    //age表示年龄

    public Student(String ID, String name, char gender, int age) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

//    public static String getBanji(){
//        return banji;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
