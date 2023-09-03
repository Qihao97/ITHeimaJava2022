package paragraph05.sec5_3.package_test;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 9:52
 * @Descriptions: 在同一个类中，无论成员变量和方法用什么关键字修饰，
 * 所有的成员和方法都是可以访问的
 * 书，P122
 */
public class PackageTest {
    private int privateMember;
    int packageMember;
    protected int protectedMember;
    public int publicMember;

    public PackageTest(int privateMember, int packageMember, int protectedMember, int publicMember) {
        this.privateMember = privateMember;
        this.packageMember = packageMember;
        this.protectedMember = protectedMember;
        this.publicMember = publicMember;
    }

    private void privatePrintMember() {
        System.out.println("========private方法==========");
        System.out.println("private成员： " + privateMember);
        System.out.println("package成员： " + packageMember);
        System.out.println("protected成员： " + protectedMember);
        System.out.println("public成员： " + publicMember);
    }

    void packagePrintMember() {
        System.out.println("========package方法==========");
        System.out.println("private成员： " + privateMember);
        System.out.println("package成员： " + packageMember);
        System.out.println("protected成员： " + protectedMember);
        System.out.println("public成员： " + publicMember);
    }

    protected void protectedPrintMember() {
        System.out.println("========protected方法==========");
        System.out.println("private成员： " + privateMember);
        System.out.println("package成员： " + packageMember);
        System.out.println("protected成员： " + protectedMember);
        System.out.println("public成员： " + publicMember);
    }

    public void publicPrintMember() {
        System.out.println("========public方法==========");
        System.out.println("private成员： " + privateMember);
        System.out.println("package成员： " + packageMember);
        System.out.println("protected成员： " + protectedMember);
        System.out.println("public成员： " + publicMember);
    }

    public static void main(String[] args) {
        PackageTest packageTest = new PackageTest(1, 2, 3, 4);
        packageTest.privatePrintMember();
        packageTest.packagePrintMember();
        packageTest.protectedPrintMember();
        packageTest.publicPrintMember();

        System.out.println("--------------------华丽的分割线--------------------");
        System.out.println("--------------------以下测试NewClass类--------------------");
        NewClass newClass = new NewClass(10, 20, 30, 40);
        System.out.println("--------------------访问NewClass的成员变量：--------------------");
//        不能够访问NewClass的private成员变量
//        System.out.println("private成员： " + newClass.privateMember);
//        可以访问NewClass类的package、protected、public成员
        System.out.println("package成员： " + newClass.packageMember);
        System.out.println("protected成员： " + newClass.protectedMember);
        System.out.println("public成员： " + newClass.publicMember);

        System.out.println("--------------------访问NewClass的成员方法：--------------------");
//        不能访问NewClass类的private方法，可以访问NewClass类的package、protected、public成员方法
//        newClass.privatePrintMember();
        newClass.packagePrintMember();
        newClass.protectedPrintMember();
        newClass.publicPrintMember();
    }
}
