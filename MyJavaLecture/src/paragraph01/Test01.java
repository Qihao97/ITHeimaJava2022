package paragraph01;

/**
 * @Author: Qihao
 * @Time: 3/5/2024 7:29 PM
 * @Descriptions: TODO
 */
public class Test01 {
    // 成员变量
    public static void main(String args[]){
//        System.out.println("Hello World!");

        Car car = new Car();
        car.color = "white";
        car.name = "梅赛德斯";

        car.Direct();
        car.Park();
    }
}
