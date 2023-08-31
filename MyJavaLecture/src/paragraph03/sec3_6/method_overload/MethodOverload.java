package paragraph03.sec3_6.method_overload;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Qihao
 * @Time: 2023/8/31 21:32
 * @Descriptions: 方法重载测试，P76，程序3.13
 */
public class MethodOverload extends JApplet  //定义类MethodOverload
{
    public void init() {
        JTextArea outputArea = new JTextArea(2, 20);  //创建组件对象outputArea
        Container c = getContentPane();              //创建一个容器对象c
        c.add(outputArea);                  //组件对象outputArea放入容器c中
        outputArea.setText("The square of integer 7 is" + square(7) + "\nThe square of double 7.5 is" + square(7.5));
    }

    public int square(int x)          //调用参数为 int类型的square方法
    {
        return x * x;
    }

    public double square(double y)    //调用参数为 double类型的square方法
    {
        return y * y;
    }
}
