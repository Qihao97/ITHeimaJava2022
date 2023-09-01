package paragraph04.sec4_5_animal_demo3;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 13:20
 * @Descriptions: 本类为一个Duck类，继承自Animal，实现了其makeSound方法
 */
public class Duck extends Animal {
    public Duck(int legNum) {
        super(legNum);
    }

    @Override
    public void makeSound() {
        System.out.println("嘎嘎嘎~");
    }
}
