package itheima_edu_info_manager.com.itheima.edu.info.manager.domain;

/***
 * @Author : Qihao
 * @Date   : 2022/11/8 15:46
 * @Description : 学生类基本描述
 */
public class Student {
    private String id;
    private String name;
    private String age;
    private String birthday;

    public Student() {
    }

    public Student(String id, String name, String age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
