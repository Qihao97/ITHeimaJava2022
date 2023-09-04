package paragraph07.sec7_2;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 9:24
 * @Descriptions: P174, 程序7.7
 * 声明异常格式：
 * <访问权限修饰符><返回值类型><方法名><参数列表> throws 异常1,异常2...
 */
public class TestException4 {
    private String id;

    public void setId(String id) throws IllegalArgumentException {
        if (id.length() == 7) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("参数长度应为7");
        }
    }

    public static void main(String[] args) {
        TestException4 test = new TestException4();
        test.setId("1234567");
        System.out.println(test.id);
        System.out.println("---------*****华丽的分割线*****---------");
        test.setId("123456");
        System.out.println(test.id);
    }
}
