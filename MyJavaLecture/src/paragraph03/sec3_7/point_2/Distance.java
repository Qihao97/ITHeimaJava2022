package paragraph03.sec3_7.point_2;

/**
 * @Author: Qihao
 * @Time: 2023/8/31 21:43
 * @Descriptions: 本类用来测试Point类，P80，程序3.16
 */
public class Distance {
    public static void main(String[] args) {
        Point p1, p2, p3;
        p1 = new Point();
        p2 = new Point(10, 20);
        p3 = new Point(p2.y, p2.x);
        System.out.println("p1与p2的距离为" + p1.getDis(p2));
        System.out.println("p2与p3的距离为" + p2.getDis(p3));
    }
}
