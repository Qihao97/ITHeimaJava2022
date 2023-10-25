package paragraph11.demo11_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: Qihao
 * @Time: 2023/10/25 14:55
 * @Descriptions: 程序11.4
 */
public class ServerExample {
    public static void main(String args[]) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("服务器启动！");
            Socket socket = serverSocket.accept();// 监听来自客户端的连接
            BufferedReader inputs = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("客户端发来的信息是：" + inputs.readLine());//获取连接输入流，输出来自客户的信息
            PrintWriter outputs = new PrintWriter(socket.getOutputStream());
            outputs.println("您好，我的名字是尼克！"); //获取连接输出流，向客户端发送消息

            outputs.flush();
            inputs.close();
            outputs.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
