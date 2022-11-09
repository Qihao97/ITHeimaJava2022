package itheima_edu_info_manager.com.itheima.edu.info.manager.entry;

import itheima_edu_info_manager.com.itheima.edu.info.manager.controller.StudentController;
import itheima_edu_info_manager.com.itheima.edu.info.manager.controller.TeacherController;

import java.util.Scanner;

/***
 * @Author : Qihao
 * @Date   : 2022/11/8 15:49 
 * @Description : 系统入口程序
 *
 * static关键字：
 *      1.被static关键字修饰的成员函数或者成员变量，会被该类所有对象所共享
 *      2.被static关键字修饰的内容，在堆中有专门静态区存储，随着类的加载而加载，优先于对象存在，
 *        因此被static关键字修饰的成员函数，只能使用静态变量
 *      3.静态内容可以直接使用类名.调用
 *
 */
public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // 主菜单搭建
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    // System.out.println("学生管理");
                    // 开启学生管理系统
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case "2":
                    // System.out.println("老师管理");
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
                    break;
                case "3":
                    System.out.println("感谢您的使用");
                    // 退出当前正在运行的JVM虚拟机
                    System.exit(0);
                default:
                    System.out.println("您的输入有误, 请重新输入");
                    break;
            }
        }
    }
}
