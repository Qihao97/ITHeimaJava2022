package paragraph03.sec3_4.carDemo;

/**
 * @Author: Qihao
 * @Time: 2023/8/30 9:14
 * @Descriptions: 定义一个Car类，用来测试构造方法
 */
public class Car {
    private String Brand;
    int gas;

    //定义一个构造方法，用来完成Car类成员变量的初始化
    Car (String vBrand, int vGas) {
        Brand = vBrand;
        gas = vGas;
    }

    //Disp方法，用来输出对象的信息
    void Disp() {
        System.out.println("品牌：" + Brand + ",\t油量：" + gas);
    }
}
