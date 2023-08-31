package paragraph03.sec3_5.static_variable_method;

/**
 * @Author: Qihao
 * @Time: 2023/8/31 21:10
 * @Descriptions: 静态变量和静态方法的使用，P69程序3.10
 */
public class StaticDemo {
    static int x;                  //定义静态变量x
    int y;                         //定义实例变量y

    static public int getX() {      //定义静态方法getX
        return x;
    }

    static public void setX(int newX) {  //定义静态方法setX
        x = newX;
    }

    public int getY() {                 //定义实例方法getY
        return y;
    }

    public void setY(int newY)        //定义实例方法setY
    {
        y = newY;
    }
}
