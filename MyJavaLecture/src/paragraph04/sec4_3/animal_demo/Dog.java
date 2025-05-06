package paragraph04.sec4_3.animal_demo;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 9:35
 * @Descriptions: 本类继承Animal类，创建Dog类
 */
public class Dog extends Animal {
    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("汪汪汪~");
    }

    public void jump(){
        System.out.println("狗狗跳跃");
    }

    public void watchDoor(){
        System.out.println("小狗看门中。。。");
    }
}
