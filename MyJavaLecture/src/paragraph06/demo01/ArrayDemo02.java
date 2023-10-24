package paragraph06.demo01;

/**
 * @Author: Qihao
 * @Time: 2023/9/20/16:23
 * @Descriptions:
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("LiuMouMou","00001",90,"Black");
        dogs[1] = new Dog();
        dogs[2] = new Dog("WenMouMou", "0002", 50, "Black");

        Dog dog1 = new Dog("Qinxiaomou", "0003", 55, "Yellow");
        Dog dog2 = new Dog("QinmouG", "0003", 55, "Yellow");
        Dog[] dogss = {dog1,dog2};
        for (Dog dog :
                dogss) {
            System.out.println(dog);
        }
    }
}
