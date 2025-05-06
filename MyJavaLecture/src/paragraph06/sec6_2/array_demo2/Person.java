package paragraph06.sec6_2.array_demo2;

/**
 * @Author: Qihao
 * @Time: 2023/9/2 17:47
 * @Descriptions: 本类为Person类，用于存入ArrayList集合中，P148，程序6.8
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   @Override
   public boolean equals(Object obj) {
        if (!(obj instanceof Person))
            return false;
        Person p = (Person) obj;
        return this.name.equals(p.name) && this.age == p.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
