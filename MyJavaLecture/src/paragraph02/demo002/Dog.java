package paragraph02.demo002;

/**
 * @Author: Qihao
 * @Time: 2023/9/13/8:43
 * @Descriptions: 演示构造方法
 */
public class Dog {
    private String name;
    private int age;
    private String color;
    private char gender;

    public void speak(){
        System.out.println("汪汪汪~");
    }

    //默认构造方法
    Dog(){}

    //初始化构造方法
    Dog(String name,int age, String color, char gender){
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
        System.out.println(this.name + "初始化完毕！");
    }

    public void showInfo(){
        System.out.println("狗狗信息如下：");
        System.out.println("狗狗的名字是： " + this.name);
        System.out.println("狗狗的年龄是： " + this.age);
        System.out.println("狗狗的颜色是： " + this.color);
        System.out.println("狗狗的性别是： " + this.gender);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }
}
