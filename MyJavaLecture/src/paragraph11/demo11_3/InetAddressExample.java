package paragraph11.demo11_3;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: Qihao
 * @Time: 2023/10/25 14:51
 * @Descriptions: 程序11.3
 */
public class InetAddressExample {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress localhost = InetAddress.getLocalHost();//获取本机信息
        System.out.println("localhost.getCanonicalHostName()的值为：" + localhost.getCanonicalHostName());
        System.out.println("localhost.getHostName()的值为：" + localhost.getHostName());
        System.out.println("localhost.getHostAdress()的值为：" + localhost.getHostAddress());
        System.out.println("localhost.toString()的值为：" + localhost.toString());
        InetAddress designatedhost = InetAddress.getByName("www.163.com");//获取指定域名主机信息
        System.out.println("designatedhost.getCanonicalHostName()的值为：" + localhost.getCanonicalHostName());
        System.out.println("designatedhost.getHostName()的值为：" + localhost.getHostName());
        System.out.println("designatedhost.getHostAdress()的值为：" + localhost.getHostAddress());
        System.out.println("designatedhost.toString()的值为：" + localhost.toString());

        InetAddress[] addresses = InetAddress.getAllByName("www.163.com");
        System.out.println("InetAddress.getAllByName(\"www.163.com\") 获取的地址字节数组如下：");
        for (InetAddress address : addresses)    //循环输出www.163.com的所有IP地址
            System.out.println(address);
    }
}
