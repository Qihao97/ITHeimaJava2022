package paragraph04.sec4_5_animal_demo3;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 13:23
 * @Descriptions: 本类为一Rabbit类，继承自Animal类，实现了其makeSound方法
 */
public class Rabbit extends Animal {
    public Rabbit(int legNum) {
        super(legNum);
    }

    @Override
    public void makeSound() {
        System.out.println("兔兔不乱叫~");
    }
}
