package paragraph03.sec3_2;

/**
 * @Author: Qihao
 * @Time: 2023/8/29 17:59
 * @Descriptions: 书上49页程序3.1，先创建一个Rectangle类
 */
public class Rectangle {
    double width, height;
    Rectangle(double w, double h){  //类的带参数构造方法
        width = w;
        height = h;
    }

    double area(){ //求矩形面积方法
        return width * height;
    }
}
