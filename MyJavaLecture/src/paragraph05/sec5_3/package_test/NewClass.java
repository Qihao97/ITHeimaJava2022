package paragraph05.sec5_3.package_test;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 10:25
 * @Descriptions: 本类用来测试在同一个包中不同类之间，
 * 访问不同关键字修饰的成员变量和方法
 */
public class NewClass {
    private int privateMember;
    int packageMember;
    protected int protectedMember;
    public int publicMember;

    public NewClass(int privateMember, int packageMember, int protectedMember, int publicMember) {
        this.privateMember = privateMember;
        this.packageMember = packageMember;
        this.protectedMember = protectedMember;
        this.publicMember = publicMember;
    }

    private void privatePrintMember() {
        System.out.println("========NewClass的private方法==========");
        System.out.println("private成员： " + privateMember);
        System.out.println("package成员： " + packageMember);
        System.out.println("protected成员： " + protectedMember);
        System.out.println("public成员： " + publicMember);
    }

    void packagePrintMember() {
        System.out.println("========NewClass的package方法==========");
        System.out.println("private成员： " + privateMember);
        System.out.println("package成员： " + packageMember);
        System.out.println("protected成员： " + protectedMember);
        System.out.println("public成员： " + publicMember);
    }

    protected void protectedPrintMember() {
        System.out.println("========NewClass的protected方法==========");
        System.out.println("private成员： " + privateMember);
        System.out.println("package成员： " + packageMember);
        System.out.println("protected成员： " + protectedMember);
        System.out.println("public成员： " + publicMember);
    }

    public void publicPrintMember() {
        System.out.println("========NewClass的public方法==========");
        System.out.println("private成员： " + privateMember);
        System.out.println("package成员： " + packageMember);
        System.out.println("protected成员： " + protectedMember);
        System.out.println("public成员： " + publicMember);
    }
}
