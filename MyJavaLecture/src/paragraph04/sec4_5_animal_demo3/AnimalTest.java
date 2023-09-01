package paragraph04.sec4_5_animal_demo3;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 13:24
 * @Descriptions: 本类带有主方法，用来测试
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal dog, cat,rabbit,duck,goose;
        dog = new Dog(4);
        cat = new Cat(4);
        rabbit = new Rabbit(4);
        duck = new Duck(2);
        goose=new Goose(2);

        //设置行走方式
        dog.setMoveBehavior(new FourLegMove());
        cat.setMoveBehavior(new FourLegMove());
        rabbit.setMoveBehavior(new FourLegMove());
        duck.setMoveBehavior(new TwoLegMove());
        goose.setMoveBehavior(new TwoLegMove());

        //输出行走方式
        dog.performMove();
        cat.performMove();
        rabbit.performMove();
        duck.performMove();
        goose.performMove();
    }
}
