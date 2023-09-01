package paragraph04.sec4_4.animal_demo2;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 10:40
 * @Descriptions: 本类所实现的Animal类，带有抽象方法，为抽象类
 */
public abstract class Animal {
    private int legNum;
    public abstract void makeSound();

    public Animal(int legNum) {
        this.legNum = legNum;
    }

    public int getLegNum() {
        return legNum;
    }
}
