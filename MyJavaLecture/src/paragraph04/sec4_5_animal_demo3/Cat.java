package paragraph04.sec4_5_animal_demo3;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 13:08
 * @Descriptions: Cat类，P106
 */
public class Cat extends Animal {
    public Cat(int legNum) {
        super(legNum);
    }

    @Override
    public void makeSound() {
        System.out.println("喵喵喵~");
    }
}
