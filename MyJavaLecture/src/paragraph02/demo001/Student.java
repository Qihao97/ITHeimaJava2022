package paragraph02.demo001;

/**
 * @Author: Qihao
 * @Time: 2023/9/6/16:15
 * @Descriptions: 演示学生类
 */
public class Student {
    //    成员变量
    String ID;  //ID表示学号
    private String name = "LiMing";
    private char gender = 'M';    //gender表示性别，M表示男性，F表示女性
    private int age = 20;    //age表示年龄

    public Student(){}

    public Student(String ID, String name, char gender, int age) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("对象初始化完毕！");
    }

    //    成员方法
    public void sleep() {
        System.out.println("睡觉中...");
    }

    public void eat() {
        System.out.println("吃饭中...");
    }

    public void study() {
        System.out.println("学习中...");
    }

    public void showInfo(){
        System.out.println("该学生信息如下：");
        System.out.println("姓名:" + name);
        System.out.println("学号:" + ID);
        System.out.println("性别:" + gender);
        System.out.println("年龄:" + age);
    }

    public void setInfo(){
        ID = "1001";
        name = "Lily";
        age = 18;
        gender = 'F';
        System.out.println("学生信息设置完毕!");
    }

    public boolean equals(Student stu){
        boolean e = false;
        if ((this.ID.equals(stu.ID)) &&
                (this.name.equals(stu.name))&&
                (this.age == stu.age)&&
                (this.gender == stu.gender)) {
            e = true;
        }
        return e;
    }

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
