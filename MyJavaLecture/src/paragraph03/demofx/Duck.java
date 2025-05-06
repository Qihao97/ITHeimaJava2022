package paragraph03.demofx;

/**
 * @Author: Qihao
 * @Time: 3/15/2025 8:45 AM
 * @Descriptions: 鸭子
 */
public class Duck {
//    成员变量
    public String color;    // 颜色
    public double shengao;  // 身高
    public int age;         // 年龄，用月份表示

//    成员方法
    public void speak() {
        System.out.println("嘎嘎嘎...嘎嘎嘎...");
    }

    public void walk() {
        System.out.println("小鸭子一歪一歪地走。");
    }

    Duck(){}

    Duck(String color, double shengao, int age){
        this.color = color;
        this.shengao = shengao;
        this.age = age;
    }


//    主函数
    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.color = "白色";
        duck.shengao = 50.5;
        duck.age = 6;

        duck.speak();
        duck.walk();

        Duck duck1 = new Duck("黄色", 35.5, 2);


    }
}
