package paragraph04.sec4_1.human_resource_system;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 8:47
 * @Descriptions: 本类为人力资源管理系统中的雇员类，P84，程序4.1
 */
public class Employee {
    private String name;
    private String id;
    private String hireDay;
    private String address;
    private String cellPhone, homePhone;
//    private String title;
    private double salary;

    public Employee(String name, String id, String hireDay, String address, String cellPhone, String homePhone, double salary) {
        this.name = name;
        this.id = id;
        this.hireDay = hireDay;
        this.address = address;
        this.cellPhone = cellPhone;
        this.homePhone = homePhone;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHireDay() {
        return hireDay;
    }

    public void setHireDay(String hireDay) {
        this.hireDay = hireDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", hireDay='" + hireDay + '\'' +
                ", address='" + address + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", salary=" + salary +
                '}';
    }
}
