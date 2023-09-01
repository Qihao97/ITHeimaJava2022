package paragraph04.sec4_6.inner_class;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 14:19
 * @Descriptions: 测试内部类，P111
 */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建内部类对象，先创建外部类对象，然后调用方法进行创建
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass1 outerInner1 = outerClass.getInnerClass1();

    }
}
