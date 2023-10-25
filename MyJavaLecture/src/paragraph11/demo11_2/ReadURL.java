package paragraph11.demo11_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author: Qihao
 * @Time: 2023/10/25 14:50
 * @Descriptions: 程序11.2
 */
public class ReadURL {
    public static void main(String args[]) {
        try {
            URL t = new URL("http://www.baidu.com");
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(t.openStream()));
                String line;
                while ((line = reader.readLine()) != null)
                    System.out.println(line);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
