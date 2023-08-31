package paragraph03.sec3_7.point_1;

/**
 * @Author: Qihao
 * @Time: 2023/8/31 21:39
 * @Descriptions: P78, 程序3.14
 */
public class Point {
    int x, y;   //成员变量，即坐标值

    Point(int a, int b)     //构造方法
    {
        x = a;
        y = b;
    }

    double getDis(Point p)   //计算到点p的距离的成员方法
    {
        double dis;
        dis = Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
        return dis;
    }
}
