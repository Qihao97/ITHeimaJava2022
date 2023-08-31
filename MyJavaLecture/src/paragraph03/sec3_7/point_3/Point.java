package paragraph03.sec3_7.point_3;

/**
 * @Author: Qihao
 * @Time: 2023/8/31 21:45
 * @Descriptions: P81，改写Point类，程序3.17
 */
public class Point {
    int x, y;
    static int n = 0;//声明类变量n并赋初值

    Point() {
        x = 0;
        y = 0;
        n++;//每次构造方法的调用即对n加1
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        n++;//同无参数的构造方法
    }

    double getDis(Point p) {
        double dis;
        dis = Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
        return dis;
    }
}
