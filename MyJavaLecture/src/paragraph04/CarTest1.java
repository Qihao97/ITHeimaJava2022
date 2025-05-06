package paragraph04;

import paragraph03.Car;

/**
 * @Author: Qihao
 * @Time: 4/26/2024 9:57 AM
 * @Descriptions: TODO
 */
public class CarTest1 {
    public static void main(String[] args) {

        Car car = new Car();
//        不同的包下，只有public可以正常访问
//        System.out.println(car.color); //public
//        System.out.println(car.age); // private
//        System.out.println(car.no); //protected
//        System.out.println(car.person_num);
    }
}
