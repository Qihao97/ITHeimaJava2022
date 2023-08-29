package paragraph01;

import java.util.Date;  //导入包中的Date类

/**
 * @Author: Qihao
 * @Time: 2023/8/29 9:32
 * @Descriptions:
 */
public class Demo_1_3_4_Test {  //类头，花括号中的为类体
    public static void main(String[] args) {
        Date date = new Date(34512);    //使用导入的类创建对象
        D(date);                        //调用自定义方法
        System.out.println(date.getTime());
    }
    public static void D(Date date){    //自定义方法
        date.setTime(21543);
    }
}
