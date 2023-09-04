package paragraph07.sec7_3;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 10:15
 * @Descriptions: P181, 程序7.11，继承Throwable类
 */
public class MySecondException extends Throwable {
    public MySecondException() {
        super();
    }

    public MySecondException(String msg) {
        super(msg);
    }

    public MySecondException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public MySecondException(Throwable cause) {
        super(cause);
    }
}
