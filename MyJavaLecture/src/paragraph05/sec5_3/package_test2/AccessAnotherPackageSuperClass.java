package paragraph05.sec5_3.package_test2;

import paragraph05.sec5_3.package_test.NewClass;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 10:44
 * @Descriptions: 本类为NewClass的派生类
 */
public class AccessAnotherPackageSuperClass extends NewClass {
    public AccessAnotherPackageSuperClass(int privateMember, int packageMember, int protectedMember, int publicMember) {
        super(privateMember, packageMember, protectedMember, publicMember);
    }

    public static void main(String[] args) {
        AccessAnotherPackageSuperClass accessAnotherPackageSuperClass =
                new AccessAnotherPackageSuperClass(11, 22, 33, 44);
        System.out.println("=============访问超类NewClass成员变量=============");
//        不能访问另一个包中超类的private和默认成员变量和方法
//        accessAnotherPackageSuperClass.privateMember =10;
//        accessAnotherPackageSuperClass.packageMember =20;
        accessAnotherPackageSuperClass.protectedMember = 30;
        accessAnotherPackageSuperClass.publicMember = 40;
        System.out.println("输出超类的protected成员： " + accessAnotherPackageSuperClass.protectedMember);
        System.out.println("输出超类的public成员： " + accessAnotherPackageSuperClass.publicMember);

        System.out.println("=============访问超类NewClass成员方法=============");
//        不能访问另一个包中超类的private和默认成员变量和方法
//        accessAnotherPackageSuperClass.privatePrintMember();
//        accessAnotherPackageSuperClass.packagePrintMember();
        accessAnotherPackageSuperClass.protectedPrintMember();
        accessAnotherPackageSuperClass.publicPrintMember();
    }
}
