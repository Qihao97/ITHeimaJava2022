package paragraph06.sec6_2.map_hash_tree;

/**
 * @Author: Qihao
 * @Time: 2023/9/3 9:35
 * @Descriptions: 本类实现的Student类，实现了Comparable接口的compareTo方法
 */
public class Student implements Comparable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student student) {
        int num = new Integer(this.age).compareTo(new Integer(student.age));
        if (num == 0) {
            return this.name.compareTo(student.name);
        }
        return num;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int hashCode() {
        return name.hashCode() + age * 34;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            throw new ClassCastException("类型不匹配");
        }
        Student student = (Student) obj;
        return this.name.equals(student.name) && this.age == student.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
