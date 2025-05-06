package paragraph12.demo12_3;

import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.Base64;

/**
 * @Author: Qihao
 * @Time: 11/14/2023 7:08 PM
 * @Descriptions: 查询
 */
public class SelectRecordDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        final Base64.Decoder decoder = Base64.getDecoder();
        final Base64.Encoder encoder = Base64.getEncoder();
        //声明JDBC驱动对象
        String jdDriver = "com.mysql.cj.jdbc.Driver";
        //声明JDBC的URL
        String url = "jdbc:mysql://127.0.0.1/test";
        String user = new String(decoder.decode("cm9vdA=="),"UTF-8");
        String pwd = new String(decoder.decode("YWRtaW5hZG1pbg=="),"UTF-8");

        // 加载驱动
        try {
            Class.forName(jdDriver);
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println("forName:" + e.getMessage());
        }

        try {
            // 连接数据库
            Connection conn = DriverManager.getConnection(url, user, pwd);
            // 建立Statement对象
            Statement st = conn.createStatement();
            // 查询的SQL语句
            String strSelect = "SELECT * FROM viStudent "
                    + "WHERE 院部 = '计算机学院'";

            ResultSet rs = st.executeQuery(strSelect); // 执行SQL语句
            //将查询结果逐条输出到屏幕上
            while (rs.next()) {
                System.out.println(rs.getString("学号") + "\t"
                        + rs.getString("姓名") + "\t"
                        + rs.getString("性别") + "\t"
                        + rs.getString("院部") + "\t"
                        + rs.getString("专业"));
            }
            st.close(); // 关闭连接
        } catch (SQLException e) {
            System.out.println("SQLExcetption: " + e.getMessage());
        }
    }
}
