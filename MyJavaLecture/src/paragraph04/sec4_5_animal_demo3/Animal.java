package paragraph04.sec4_5_animal_demo3;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 12:25
 * @Descriptions: 本类为一个抽象类，带有抽象方法makeSound
 */
public abstract class Animal {
    private int legNum;
    private MoveBehavior moveBehavior;

    public abstract void makeSound();

    public Animal(int legNum) {
        this.legNum = legNum;
    }

    public int getLegNum() {
        return legNum;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void performMove(){
        moveBehavior.move();
    }
}
