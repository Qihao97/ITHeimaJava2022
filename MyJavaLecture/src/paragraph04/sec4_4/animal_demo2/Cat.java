package paragraph04.sec4_4.animal_demo2;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 11:11
 * @Descriptions: 本类继承自Animal类，实现了其抽象方法
 */
public class Cat extends Animal {
    public Cat(int legNum) {
        super(legNum);
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("喵喵喵~");
    }
}
