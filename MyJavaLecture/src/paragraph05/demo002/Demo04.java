package paragraph05.demo002;

import paragraph05.demo001.Demo01;

/**
 * @Author: Qihao
 * @Time: 2023/9/20/9:08
 * @Descriptions: 继承Demo01
 */
public class Demo04 extends Demo01 {
    public Demo04() {
    }

    public Demo04(int privateInt, int publicInt, int protectedInt, int defaultInt) {
        super(privateInt, publicInt, protectedInt, defaultInt);
    }
}
