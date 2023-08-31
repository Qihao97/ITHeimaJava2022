package paragraph03.sec3_5.static_variable_method;

/**
 * @Author: Qihao
 * @Time: 2023/8/31 21:14
 * @Descriptions: 本类用来测试StaticDemo，P70，程序3.10
 */
public class ShowDemo {
    public static void main(String args[]) {
        System.out.println("静态变量x = " + StaticDemo.getX());
//静态方法的引用使用类名非法，编译将出错
//System.out.println(“实例变量y=”+StaticDemo.getY());
        StaticDemo a = new StaticDemo();
        StaticDemo b = new StaticDemo();
        a.setX(1);
        a.setY(2);
        b.setX(3);//对象a和b中的x共享同一个存储区域，在同一时刻x值是一样
        b.setY(4); //对象a和b中的y有着不同的存储区域，可以有不同的值
        System.out.println("静态变量a.x = " + a.getX());
        System.out.println("实例变量a.y = " + a.getY());
        System.out.println("静态变量b.x = " + b.getX());
        System.out.println("实例变量b.y = " + b.getY());
    }
}
