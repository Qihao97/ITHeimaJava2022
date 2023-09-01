package paragraph04.sec4_5_animal_demo3;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 13:19
 * @Descriptions: 本类实现Animal类中的makeSound方法
 */
public class Dog extends Animal {
    public Dog(int legNum) {
        super(legNum);
    }

    @Override
    public void makeSound() {
        System.out.println("汪汪汪~");
    }
}
