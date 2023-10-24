package paragraph06.demo01;

/**
 * @Author: Qihao
 * @Time: 2023/9/20/16:21
 * @Descriptions: 狗
 */
public class Dog {
    private String name;
    private String ID;
    private int age;
    private String color;

    public Dog() {
    }

    public Dog(String name, String ID, int age, String color) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.color = color;
    }

    public void speak() {
        System.out.println("汪汪汪~");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
