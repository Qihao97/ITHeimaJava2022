package paragraph04.sec4_5_animal_demo3;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 12:30
 * @Descriptions: 本类实现了MoveBehavior接口的move方法，四条腿走路
 */
public class FourLegMove implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("四条腿行走");
    }
}
