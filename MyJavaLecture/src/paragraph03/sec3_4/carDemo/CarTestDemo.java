package paragraph03.sec3_4.carDemo;

/**
 * @Author: Qihao
 * @Time: 2023/8/30 9:22
 * @Descriptions: 本类用来测试Car类
 */
public class CarTestDemo {
    public static void main(String[] args) {
        Car car = new Car("大众", 30);
        Car car1 = new Car("大众", 30);
        Car car2 = new Car(car);
        Car car3 = car;
        System.out.println(car.Brand);
        System.out.println(car3.Brand);
        car.Brand = "本田";
        System.out.println(car3.Brand);
        System.out.println(car2.Brand);

//        car.Disp();
    }
}
