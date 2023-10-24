package paragraph03.demo001;

/**
 * @Author: Qihao
 * @Time: 2023/9/13/16:35
 * @Descriptions: 带主方法的类，用来测试
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("来福", "黄", 4);
        dog.speak();
        System.out.println(dog.getLegs());

        Cat cat = new Cat("Tom", "Blue", 4);
        cat.speak();
        System.out.println(cat.getName());

        System.out.println("-------------------");
        Animal animal = new Animal("小动物", "white", 4);
        animal = dog;   //基类对象指向了派生类对象
        animal.speak();
        animal = cat;
        animal.speak();

        System.out.println("=====================");
        dog.run();
        animal = dog;
//        animal.run();

    }
}
