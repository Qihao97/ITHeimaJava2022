package paragraph04.sec4_4.animal_demo2;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 11:15
 * @Descriptions: 本类继承自Animal类，实现了其makeSound方法
 */
public class Dog extends Animal {
    public Dog(int legNum) {
        super(legNum);
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("汪汪汪~");
    }
}
