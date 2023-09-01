package paragraph04.sec4_3.animal_demo;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 9:37
 * @Descriptions: 本类书写了主函数，用来测试Animal及其派生类，
 * 并且演示面向对象的多态性
 */
public class AnimalTest {
    public static void main(String[] args) {
        //正常创建Cat、Dog对象
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        dog.jump();
        cat.makeSound();
        cat.jump();

        System.out.println("==============华丽的分割线================");
        //面向对象的多态性
        Animal animal = new Animal();
        animal = dog;
        animal.makeSound();
        Animal animal1 = cat;
        animal1.makeSound();
    }
}
