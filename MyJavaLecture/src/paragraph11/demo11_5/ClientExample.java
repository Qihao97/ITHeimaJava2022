package paragraph11.demo11_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @Author: Qihao
 * @Time: 2023/10/25 14:52
 * @Descriptions: 程序11.5
 */
public class ClientExample {
    public static void main(String args[]) {
        try {
            Socket clientSocket = new Socket("127.0.0.1", 8888);
            PrintWriter outputs = new PrintWriter(clientSocket.getOutputStream());
            outputs.println("你好，我是我叫朱迪, 请问你叫什么名字？"); //获取连接输出流，向服务器发送消息
            outputs.flush();
            BufferedReader inputs = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("服务器发来的信息是：" + inputs.readLine());//获取连接输入流，输出来自服务器的信息
            inputs.close();
            outputs.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
