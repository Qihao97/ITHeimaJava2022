package paragraph07.sec7_3;

/**
 * @Author: Qihao
 * @Time: 2023/9/4 10:08
 * @Descriptions: P180, 程序7.11
 * 自定义异常类的主要作用是区分异常发生的位置，当用户遇到异常时，
 * 根据异常名就可以知道哪里有异常，据此可便于修改程序
 */
public class MyFirstException extends Exception {
    public MyFirstException() {
        super();
    }

    public MyFirstException(String msg) {
        super(msg);
    }

    public MyFirstException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public MyFirstException(Throwable cause) {
        super(cause);
    }
}
