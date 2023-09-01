package paragraph04.sec4_2.human_resource_system;

import paragraph04.sec4_1.human_resource_system.Employee;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 9:02
 * @Descriptions: 本类用于实现人力资源管理系统中的经理类，P87，程序4.3
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, String hireDay, String address, String cellPhone, String homePhone, double salary, double bonus) {
        super(name, id, hireDay, address, cellPhone, homePhone, salary);
        this.bonus = bonus;
    }

    //重载设置奖金方法 P91 4.4
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //重载设置奖金方法  P91 4.4
    public void setBonus(double basic, double ration) {
        //奖金计算方法为基数乘以比例
        this.bonus = basic * ration;
    }

    public double getBonus() {
        return bonus;
    }

    //这里重写了父类的方法，经理的工资为基本工资加奖金
    @Override
    public double getSalary() {
        //这里使用关键字super来访问基类的方法
        return this.bonus + super.getSalary();
    }
}
