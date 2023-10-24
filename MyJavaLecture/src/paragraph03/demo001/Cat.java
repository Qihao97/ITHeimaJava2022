package paragraph03.demo001;

/**
 * @Author: Qihao
 * @Time: 2023/9/13/16:41
 * @Descriptions: 猫，继承Animal
 */
public class Cat extends Animal {
    public Cat(String name, String color, int legs) {
        super(name, color, legs);
    }

    @Override
    public void speak() {
//        super.speak();
        System.out.println("喵喵喵~");
    }
}
