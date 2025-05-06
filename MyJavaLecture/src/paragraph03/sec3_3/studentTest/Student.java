package paragraph03.sec3_3.studentTest;

/**
 * @Author: Qihao
 * @Time: 2023/8/30 8:42
 * @Descriptions: 书上51页，设计学生类Student
 */
class Student {
    String name,no;
    char gender;
    int age;

    //设置学生信息的成员方法
    void setStu(String n,String o,char g,int a){
        this.name = n;
        no = o;
        gender = g;
        age = a;
    }

    void selfIntro(){
        System.out.println("我是：" + name);

        System.out.println("我的学号是：" + no);
        if (gender == 'M'){
            System.out.println("我是男孩");
            return;
        }
        else {
            System.out.println("我是女孩");
        }
        System.out.println("我今年" + age + "岁");
    }
}
