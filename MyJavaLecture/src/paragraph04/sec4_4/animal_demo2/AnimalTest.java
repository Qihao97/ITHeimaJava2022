package paragraph04.sec4_4.animal_demo2;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 11:18
 * @Descriptions: 本类书写了main方法，用来测试抽象类及其派生类
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal dog, cat;
        dog = new Dog(4);
        cat = new Cat(4);

        dog.makeSound();
        cat.makeSound();

        Rabbit rabbit = new Rabbit(4);
        rabbit.jump();
        Animal rabbit1 = rabbit;
        rabbit1.makeSound();

    }
}
