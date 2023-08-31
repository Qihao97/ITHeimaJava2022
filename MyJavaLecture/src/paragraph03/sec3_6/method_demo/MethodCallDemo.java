package paragraph03.sec3_6.method_demo;

/**
 * @Author: Qihao
 * @Time: 2023/8/31 21:29
 * @Descriptions: 本类用来测试MethodDemo类
 */
public class MethodCallDemo {
    public static void main(String args[]) {
        float max;
        float x[] = {1, 2, 3, 4, 5}; //数值带小数点就要在数组后加f表示单精度
        MethodDemo y = new MethodDemo();
        max = y.findMax(x);     //实参x是数组，数组调用的返回值是5.0
        System.out.println(max);
    }
}
