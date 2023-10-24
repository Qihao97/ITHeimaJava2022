package paragraph05.demo001;

/**
 * @Author: Qihao
 * @Time: 2023/9/20/8:47
 * @Descriptions: 演示访问权限
 */
public class Demo01 {
    private int privateInt;
    public int publicInt;
    protected int protectedInt;
    int defaultInt;

    public Demo01() {
    }

    public Demo01(int privateInt, int publicInt, int protectedInt, int defaultInt) {
        this.privateInt = privateInt;
        this.publicInt = publicInt;
        this.protectedInt = protectedInt;
        this.defaultInt = defaultInt;
    }

    public void showInfo() {
        System.out.println("private: " + this.privateInt);
        System.out.println("protected: " + this.protectedInt);
        System.out.println("public: " + this.publicInt);
        System.out.println("default: " + this.defaultInt);
    }
}
