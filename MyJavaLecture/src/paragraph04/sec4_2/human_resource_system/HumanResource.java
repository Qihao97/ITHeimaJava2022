package paragraph04.sec4_2.human_resource_system;

import paragraph04.sec4_1.human_resource_system.Employee;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 9:07
 * @Descriptions: P88，改写后的HumanResource类
 */
public class HumanResource {
    public static void main(String[] args) {
        Manager manager1 = new Manager("张三", "510228198001011001", "2015-01-01",
                "重庆市南岸区学府大道1000号", "13912345000", "023-62631000", 10000, 5000);
        System.out.println("===员工基本信息===");
        System.out.println("姓名： " + manager1.getName());
        System.out.println("身份证号： " + manager1.getId());
        System.out.println("入职日期： " + manager1.getHireDay());
        System.out.println("住址： " + manager1.getAddress());
        System.out.println("手机号码： " + manager1.getCellPhone());
        System.out.println("家庭电话： " + manager1.getHomePhone());
        System.out.println("工资： " + manager1.getSalary());

        //以下测试程序4.4修改后的代码
        System.out.println("------------------华丽的分割线---------------------");
        Manager manager2 = new Manager("李四", "510228198001011001", "2015-01-01",
                "重庆市南岸区学府大道1000号", "13912345000", "023-62631000", 10000, 5000);
        manager2.setBonus(12000, 0.50);
        System.out.println("===员工基本信息===");
        System.out.println("姓名： " + manager2.getName());
        System.out.println("身份证号： " + manager2.getId());
        System.out.println("入职日期： " + manager2.getHireDay());
        System.out.println("住址： " + manager2.getAddress());
        System.out.println("手机号码： " + manager2.getCellPhone());
        System.out.println("家庭电话： " + manager2.getHomePhone());
        System.out.println("工资： " + manager2.getSalary());
    }
}
