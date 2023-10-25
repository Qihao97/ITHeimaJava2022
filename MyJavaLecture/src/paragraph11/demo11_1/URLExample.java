package paragraph11.demo11_1;

import java.net.*;

public class URLExample {
    public static void main(String args[]) throws MalformedURLException {
        URL a = new URL("http://tech.163.com/digi/special/00164BJ7/3Dtv.html");
        System.out.println("Protocol: " + a.getProtocol());
        System.out.println("Port: " + a.getPort());
        System.out.println("Host: " + a.getHost());
        System.out.println("FileName: " + a.getFile());
        System.out.println("Ref: " + a.getRef());
        System.out.println("Path:" + a.getPath());
    }
}
