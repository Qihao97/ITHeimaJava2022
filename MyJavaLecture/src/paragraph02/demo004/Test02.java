package paragraph02.demo004;

/**
 * @Author: Qihao
 * @Time: 2023/9/13/16:07
 * @Descriptions: 本类测试带有重载方法的Student类
 */
public class Test02 {
    public static void main(String[] args) {
        Student lily = new Student("Lily", "1001", 18);
        lily.show(8);
        lily.show("Hello Lily!");
    }
}
