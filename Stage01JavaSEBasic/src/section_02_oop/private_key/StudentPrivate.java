package section_02_oop.private_key;

/**
 * @Author: Qihao
 * @Time: 2022/2022/8/16/23:25
 * @Descriptions: 带private的Student类
 *
 * this关键字：
 * 成员方法的形参与成员变量同名时，this限定的变量表示成员变量
 */
public class StudentPrivate {
    private int age = 20;
    private String name = "迪丽热巴";

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentPrivate [age=" + age + ", name=" + name + "]";
    }

    
}
