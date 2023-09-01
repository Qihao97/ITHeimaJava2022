package paragraph04.sec4_5_animal_demo3;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 12:31
 * @Descriptions: 本类实现了MoveBehavior接口的move方法，两条腿走路
 */
public class TwoLegMove implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("两条腿行走");
    }
}
