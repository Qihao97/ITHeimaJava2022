package paragraph06.sec6_2.hashset_demo;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 17:56
 * @Descriptions: 本类实现了一个Person类，用于存入hashSet集合中，P151，程序6.10
 */
public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        System.out.println(this.name + "....hashCode");
        return this.name.hashCode() + this.age * 26;
    }

//    重写equals方法
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person))
            return false;
        Person p = (Person) obj;
        System.out.println(this.name + "...equals.." + p.name);
        return this.name.equals(p.name) && this.age == p.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
