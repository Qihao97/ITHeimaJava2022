package paragraph04.sec4_6.inner_class;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 13:49
 * @Descriptions: 本类用于演示普通内部类
 */
public class OuterClass {
    private int privateOutInt;
    private int protectedOutInt;
    int defaultOutInt;
    public int publicOutInt;

    class InnerClass1 {
        private int privateIn1Int;
        protected int protectedIn1Int;
        int defaultIn1Int;
        public int publicIn1Int;

        public void accessOuterClass(){
            //可以访问外部类的所有成员
            privateOutInt = 1;
            protectedOutInt = 2;
            defaultOutInt = 3;
            publicOutInt = 4;
        }
    }

    private class InnerClass2{
        private int privateIn2Int;
        protected int protectedIn2Int;
        int defaultIn2Int;
        public int publicIn2Int;
    }

    public InnerClass1 getInnerClass1(){
        return new InnerClass1();
    }

    public InnerClass2 getInnerClass2(){
        return new InnerClass2();
    }

    public static InnerClass1 staticGetInnerClass1(){
//        不能在静态方法中直接创建内部类对象
//        return new InnerClass1();
        return (new OuterClass()).getInnerClass1();
    }

    public void accessInnerClass(){
//        不能直接访问内部类的成员
        InnerClass1 in1 = new InnerClass1();
        in1.privateIn1Int = 10;
        in1.protectedIn1Int = 20;
        in1.defaultIn1Int = 30;
        in1.publicIn1Int = 40;

        InnerClass2 in2 = new InnerClass2();
        in2.privateIn2Int = 10;
        in2.protectedIn2Int = 20;
        in2.defaultIn2Int = 30;
        in2.publicIn2Int = 40;
    }
}
