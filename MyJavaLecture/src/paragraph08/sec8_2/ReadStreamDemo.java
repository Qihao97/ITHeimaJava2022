package paragraph08.sec8_2;

import java.io.*;

/**
 * @Author: Qihao
 * @Time: 4/8/2025 3:52 PM
 * @Descriptions: TODO
 */
public class ReadStreamDemo {
    public static void main(String[] args) {
        String path = "D:/test.txt";
        File f = new File(path); //创建File类的对象，并实例化
        InputStream in = null;
        try {
            in = new FileInputStream(f); //实例化对象in
        } catch (FileNotFoundException e) {
            e.printStackTrace(); //深层次的输出异常调用的流程
        }

        //开辟一个空间用于接收文件读进来的数据
        byte b[] = new byte[1024];
        int count = 0; //实际的数据字节数
        try {
            //将数据读入缓冲区b中，同时返回读入数据的字节数
            count = in.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close(); //关闭输出流
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = new String(b, 0, count); //将byte数组转换为字符串
        System.out.println(str);
    }
}
