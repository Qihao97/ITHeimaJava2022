package paragraph05.demo002;

import paragraph05.demo001.Demo01;

/**
 * @Author: Qihao
 * @Time: 2023/9/20/9:00
 * @Descriptions: 派生Demo01
 */
public class Demo03 extends Demo01 {
    @Override
    public void showInfo() {
//        super.showInfo();
        System.out.println(super.publicInt);
        System.out.println(super.protectedInt);
//        System.out.println(super.defaultInt);
//        System.out.println(super.privateInt);
    }
}
