package paragraph05.sec5_3.package_test2;

import paragraph05.sec5_3.package_test.NewClass;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 11:26
 * @Descriptions: 本类用于测试在不同包下，没有任何关系的类之间的访问关系
 */
public class NewClassTest {
    public static void main(String[] args) {
        NewClass newClass = new NewClass(1, 2, 3, 4);

//        不能访问另一个包中超类的private、protected、默认成员变量和方法，只有public可以访问
        System.out.println("=============访问另一个包下的NewClass类的成员变量和方法测试=============");
//        访问成员变量测试
//        newClass.privateMember = 10;
//        newClass.packageMember = 20;
//        newClass.protectedMember = 30;
        newClass.publicMember = 40;
        System.out.println("NewClass的public成员变量： " + newClass.publicMember);

//        访问成员方法测试
        System.out.println("==========================华丽的分割线==========================");
        System.out.println("访问NewClass类中的成员方法：");
//        newClass.privatePrintMember();
//        newClass.protectedPrintMember();
//        newClass.packagePrintMember();
        newClass.publicPrintMember();
    }
}
