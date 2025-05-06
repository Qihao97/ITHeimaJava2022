package paragraph03.demo001;

/**
 * @Author: Qihao
 * @Time: 3/3/2025 2:46 PM
 * @Descriptions:
 */
public class Test001 {
    public static void main(String[] args) {
        Person001 p001 = new Person001();       // 创建了一个对象p001
        p001.init("张三", 18, "湖南");
        System.out.println(p001.addr);
        p001.showInfo();
    }
}
