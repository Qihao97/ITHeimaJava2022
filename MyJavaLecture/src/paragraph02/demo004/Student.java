package paragraph02.demo004;

/**
 * @Author: Qihao
 * @Time: 2023/9/13/16:01
 * @Descriptions: 带有方法重载的类
 */
public class Student {
    private String name;
    private String ID;
    private int age;

    //方法重载
    public void show(int a){
        System.out.println(a);
        System.out.println("该学生的年龄为：" + this.age);
    }

    public void show(String s) {
        System.out.println(s);
        System.out.println("该学生的学号为： " + this.ID);
        System.out.println("该学生的名字为： " + this.name);
    }
    public Student(){}

    public Student(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                '}';
    }
}
