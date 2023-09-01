package paragraph04.sec4_5_animal_demo3;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 13:21
 * @Descriptions: 本类为一个Goose类，继承自Animal类，实现了其makeSound方法
 */
public class Goose extends Animal {
    public Goose(int legNum) {
        super(legNum);
    }

    @Override
    public void makeSound() {
        System.out.println("咯咯咯~");
    }
}
