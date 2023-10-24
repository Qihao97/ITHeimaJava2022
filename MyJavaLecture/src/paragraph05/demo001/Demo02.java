package paragraph05.demo001;

/**
 * @Author: Qihao
 * @Time: 2023/9/20/8:56
 * @Descriptions:
 */
public class Demo02 {
    public Demo01 demo01 = new Demo01(11,22,33,44);

    public void showDemo01() {
//        System.out.println("private: " + demo01.privateInt);
        System.out.println(demo01.publicInt);
        System.out.println(demo01.protectedInt);
        System.out.println(demo01.defaultInt);
    }
}
