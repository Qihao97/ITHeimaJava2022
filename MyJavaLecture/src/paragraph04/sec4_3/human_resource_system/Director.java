package paragraph04.sec4_3.human_resource_system;

import paragraph04.sec4_1.human_resource_system.Employee;

/**
 * @Author: Qihao
 * @Time: 2023/9/1 9:51
 * @Descriptions: 本类为人力资源管理系统中的总监类，
 * 继承自雇员类
 */
public class Director extends Employee {
    private double bonus;   //奖金
    private double subsidy;     //津贴

    public Director(String name, String id, String hireDay, String address, String cellPhone, String homePhone, double salary, double bonus, double subsidy) {
        super(name, id, hireDay, address, cellPhone, homePhone, salary);
        this.bonus = bonus;
        this.subsidy = subsidy;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //重载设置奖金方法
    public void setBonus(double basic, double ration) {
        //奖金计算方法为基数乘以比例
        this.bonus = basic * ration;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }

    //方法重写，增加奖金和津贴
    @Override
    public double getSalary() {
//        return super.getSalary();
        return this.bonus + this.subsidy + super.getSalary();
    }
}
