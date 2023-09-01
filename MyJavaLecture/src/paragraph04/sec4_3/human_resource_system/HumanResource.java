package paragraph04.sec4_3.human_resource_system;

import paragraph04.sec4_1.human_resource_system.Employee;
import paragraph04.sec4_2.human_resource_system.Manager;

import java.util.ArrayList;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 10:06
 * @Descriptions: 本类用来测试Director类 P101，程序4.5
 */
public class HumanResource {
    private static ArrayList<Employee> employees = new ArrayList();

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public static void main(String[] args) {
        addEmployee(new Employee("张三", "510228198001011001", "2012-01-01", "重庆市南岸区学府大道100号", "13912345000", "023-12345678", 5000));
        addEmployee(new Manager("李四", "510228198201011002", "2013-01-01", "重庆市南岸区学府大道100号", "13912345001", "023-12345600", 10000, 2000));
        addEmployee(new Director("赵大", "510228198401011003", "2010-01-01", "重庆市南岸区学府大道100号", "13912345002", "023-12300000", 15000, 5000, 3000));

        for (int i = 0; i < employees.size(); i ++){
            System.out.println("===员工基本信息===");
            System.out.println("姓名： " + employees.get(i).getName());
            System.out.println("身份证号： " + employees.get(i).getId());
            System.out.println("入职日期： " + employees.get(i).getHireDay());
            System.out.println("住址： " + employees.get(i).getAddress());
            System.out.println("手机号码： " + employees.get(i).getCellPhone());
            System.out.println("家庭电话： " + employees.get(i).getHomePhone());
            System.out.println("工资： " + employees.get(i).getSalary());
        }
    }
}
