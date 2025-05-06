package paragraph02.sec2_3;

import paragraph01.Car;

import java.math.BigDecimal;

/**
 * @Author: Qihao
 * @Time: 3/6/2024 7:48 PM
 * @Descriptions: TODO
 */
public class demo {
    public static void main(String[] args) {
        int a = 1, b = 1;
        System.out.println(a == b);
        Car car1 = new Car();
        car1.name = "aaa";
        car1.color = "白色";

        Car car2 = new Car();
        car2.name = "aaa";
        car2.color = "白色";

        System.out.println(car1 == car2);

        car1 = car2;
        System.out.println(car1 == car2);

        car2.name = "张三";
        System.out.println(car1.name);
//        BigDecimal

        char c = '\"';
        System.out.println(c);


    }
}
