package paragraph04.sec4_4.animal_demo2;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 11:28
 * @Descriptions: 本类为Rabbit类，继承自Animal
 */
public class Rabbit extends Animal {
    public Rabbit(int legNum) {
        super(legNum);
    }

    @Override
    public void makeSound() {
        //空，什么都不写也可以的
        System.out.println();
    }

    public void jump(){
        System.out.println("小兔子跳一跳");
    }
}
