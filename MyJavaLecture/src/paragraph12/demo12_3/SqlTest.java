package paragraph12.demo12_3;

import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.Base64;

/**
 * @Author: Qihao
 * @Time: 11/14/2023 7:30 PM
 * @Descriptions: 测试
 */
public class SqlTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        final Base64.Decoder decoder = Base64.getDecoder();
        final Base64.Encoder encoder = Base64.getEncoder();
        //声明JDBC驱动对象
        String jdDriver = "com.mysql.cj.jdbc.Driver";
        //声明JDBC的URL
        String url = "jdbc:mysql://172.30.128.209/test";
        String user = new String(decoder.decode("amF2YVRFU1Q="), "UTF-8");
        String pwd = new String(decoder.decode("UXdlcnRfMjAyMw=="), "UTF-8");

        Connection conn = null;

        // 加载驱动
        try {
            Class.forName(jdDriver);
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println("驱动加载失败" + e.getMessage());
            e.printStackTrace();
        }

        try {
            // 连接数据库
            conn = DriverManager.getConnection(url, user, pwd);
            // 建立Statement对象
            Statement st = conn.createStatement();
            // 查询的SQL语句
            String strSelect = "SELECT * FROM viStudent "
                    + "WHERE 院部 = '计算机学院'";

            ResultSet rs = st.executeQuery(strSelect); // 执行SQL语句
            // 将查询结果逐条输出到屏幕上
            while (rs.next()) {
                System.out.println(rs.getString("学号") + "\t"
                        + rs.getString("姓名") + "\t" + rs.getString("性别") + "\t"
                        + ((ResultSet) rs).getString("院部") + "\t" + rs.getString("专业"));
            }
            st.close(); // 关闭连接
        } catch (SQLException e) {
            System.out.println("SQLExcetption: " + e.getMessage());
        }
    }
}
