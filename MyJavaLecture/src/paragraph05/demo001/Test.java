package paragraph05.demo001;

/**
 * @Author: Qihao
 * @Time: 2023/9/20/8:52
 * @Descriptions: 测试Demo0001
 */
public class Test {
    public static void main(String[] args) {
        // 同一个包下，不同的类之间访问
        Demo01 demo = new Demo01(1,2,3,4);
        System.out.println(demo.publicInt);
        System.out.println(demo.protectedInt);
        System.out.println(demo.defaultInt);
//        System.out.println(demo.privateInt);
    }
}
