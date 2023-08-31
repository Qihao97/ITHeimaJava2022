package paragraph03.sec3_7.point_2;

/**
 * @Author: Qihao
 * @Time: 2023/8/31 21:41
 * @Descriptions: P79，程序3.15
 */
public class Point {
    int x, y;

    Point()//不带参数的构造方法
    {
        x = 0;
        y = 0;
    }

    Point(int a, int b)//带参数的构造方法
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
