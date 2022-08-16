package section_02_oop.constructor;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/16/23:47
 * @Descriptions: 带构造函数的Student类
 */
public class StudentConstructor {
    private int age = 18;
    private String name = "张三";

    public StudentConstructor(){

    }

    public StudentConstructor(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentConstructor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
