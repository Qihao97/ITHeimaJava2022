package paragraph05.demo002;

import paragraph05.demo001.Demo01;

/**
 * @Author: Qihao
 * @Time: 2023/9/20/9:05
 * @Descriptions:
 */
public class Test02 {
    public static void main(String[] args) {
        // 不同包下，不同的类之间访问
//        Demo01 demo = new Demo01(1,2,3,4);
//        System.out.println(demo.publicInt);
//        System.out.println(demo.protectedInt);
//        System.out.println(demo.defaultInt);
//        System.out.println(demo.privateInt);

        Demo04 demo04 = new Demo04(1,2,3,4);
        System.out.println(demo04.publicInt);
//        System.out.println(demo04.privateInt);
//        System.out.println(demo04.protectedInt);
//        System.out.println(demo04.defaultInt);
    }
}
