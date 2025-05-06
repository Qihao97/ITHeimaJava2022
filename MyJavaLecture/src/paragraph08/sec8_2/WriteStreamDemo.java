package paragraph08.sec8_2;

import java.io.*;

/**
 * @Author: Qihao
 * @Time: 4/8/2025 3:51 PM
 * @Descriptions: TODO
 */
public class WriteStreamDemo {
    public static void main(String[] args) {
        String path = "D:/test.txt";
        File f = new File(path); //创建File类的对象，并实例化
        OutputStream out = null;
        try {
            out = new FileOutputStream(f); //实例化对象out
        } catch (FileNotFoundException e) {
//            e.printStackTrace(); //深层次的输出异常调用的流程
            System.out.println(e.getMessage());
        }

        byte b[] = "Hello world!2025\n小米科技".getBytes();
//        "".
        try {
            out.write(b); //将字节数组写入文件 D:/test.txt
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close(); //关闭输出流
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
