package paragraph04.sec4_6.anonymous_inner_class;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 14:24
 * @Descriptions: 匿名内部类
 */
public class AnonymousInnerClass {
    public BaseClass getNewBaseClass() {
        return new BaseClass() {
            private int n = 1;
            public int value() {
                return n;
            }

            public void fun() {
                System.out.println("新的BaseClass里面的fun方法.");
            }
        };
    }

    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
        BaseClass baseClass = anonymousInnerClass.getNewBaseClass();
        baseClass.fun();

//        不能访问新类中的新方法
//        baseClass.value();
    }
}
