package paragraph03.demo001;

/**
 * @Author: Qihao
 * @Time: 3/3/2025 2:24 PM
 * @Descriptions:
 */
public class Person001 {
    // 成员变量
    public int age;    // 年龄
    private String name;    // 名字
    public String addr;    // 住址

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    // 成员方法
    public void playGame(){
        String gameName = "王者荣耀";
        System.out.println("正在峡谷漫游~");
    }

    public void init(String name1, int age1, String addr1){
        name = name1;
        age = age1;
        addr = addr1;
    }
    public void showInfo(){
        System.out.println("我的名字是：" + name + "\n我的年龄是： " + age +
        "\n我家住在：" + addr);
    }

}
