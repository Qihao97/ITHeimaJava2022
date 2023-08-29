package paragraph03.sec3_2;

/**
 * @Author: Qihao
 * @Time: 2023/8/29 18:02
 * @Descriptions: 带有main方法的类，使用Rectangle类创建对象
 */
public class RectangleTest {
    public static void main(String[] args) {
        double s;
        Rectangle myRect = new Rectangle(20, 30);
        s = myRect.area();
        System.out.println("Rectangle 的面积是：" + s);
    }
}
