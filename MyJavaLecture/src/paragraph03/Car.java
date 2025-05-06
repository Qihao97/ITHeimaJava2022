package paragraph03;

/**
 * @Author: Qihao
 * @Time: 4/26/2024 9:41 AM
 * @Descriptions: TODO
 */
public class Car {
//    添加属性，成员变量
    public String color;
    public String band;

    private int age;        //表示使用的时间

    int person_num;     // 表示乘员数量

    protected String no; // 表示车牌号

    // 构造方法
    public Car(){
        this.color = "Black";
        this.band = "QiRui";
        this.age = 3;
        this.person_num = 5;
        this.no = "豫A123456";
    }
//    添加行为，即方法
    public void start(){
        System.out.println("汽车启动");
    }

    public void stop(){
        System.out.println("停车");
    }
}
