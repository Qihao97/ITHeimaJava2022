package paragraph06.sec6_2.treeset_demo;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 18:03
 * @Descriptions: 本类定义了一个Student类，重写了compareTo方法 P154，程序6.11
 */
class Student implements Comparable//该接口强制让学生具备比较性。
{
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    重写compareTo方法，按年龄进行排序
    @Override
    public int compareTo(Object obj) {
        if (!(obj instanceof Student))
            throw new RuntimeException("不是学生对象");
        Student s = (Student) obj;
        if (this.age > s.age)
            return 1;
        if (this.age == s.age) {
            return this.name.compareTo(s.name);
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
