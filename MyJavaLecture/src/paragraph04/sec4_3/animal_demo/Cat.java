package paragraph04.sec4_3.animal_demo;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 9:32
 * @Descriptions: 本类继承Animal类创建Cat类
 */
public class Cat extends Animal {
    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("喵喵喵~");
    }

    public void jump() {
        System.out.println("猫猫跳跃");
    }
}
