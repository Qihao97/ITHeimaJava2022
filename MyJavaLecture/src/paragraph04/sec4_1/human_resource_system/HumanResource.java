package paragraph04.sec4_1.human_resource_system;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 8:50
 * @Descriptions: 本类用来测试雇员类Employee，P85，程序4.2
 */
public class HumanResource {
//    Employee e1 = new Employee();
    public static void main(String[] args) {
        Employee employee1 = new Employee("张三", "510228198001011000", "2015-01-01",
                "重庆市南岸区学府大道1000号", "13912345000", "023-62631000", 4000);
        System.out.println("===员工基本信息===");
        System.out.println("姓名： " + employee1.getName());
        System.out.println("身份证号： " + employee1.getId());
        System.out.println("入职日期： " + employee1.getHireDay());
        System.out.println("住址： " + employee1.getAddress());
        System.out.println("手机号码： " + employee1.getCellPhone());
        System.out.println("家庭电话： " + employee1.getHomePhone());
        System.out.println("工资： " + employee1.getSalary());
    }
}
