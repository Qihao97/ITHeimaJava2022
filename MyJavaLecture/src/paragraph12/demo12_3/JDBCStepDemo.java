package paragraph12.demo12_3;

import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.Base64;

/**
 * @Author: Qihao
 * @Time: 11/14/2023 7:34 PM
 * @Descriptions: JDBC
 */
public class JDBCStepDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        try {
            Class.forName("Org.gjt.mm.mySQL.Driver");
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }

        final Base64.Decoder decoder = Base64.getDecoder();
        final Base64.Encoder encoder = Base64.getEncoder();
        //声明JDBC驱动对象
        String jdDriver = "com.mysql.cj.jdbc.Driver";
        //声明JDBC的URL
        String url = "jdbc:mysql://127.0.0.1/test";
        String user = new String(decoder.decode("cm9vdA=="),"UTF-8");
        String pwd = new String(decoder.decode("YWRtaW5hZG1pbg=="),"UTF-8");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            e.getMessage();
        }

        Statement sta = null;
        try {
            sta = conn.createStatement();
        } catch (SQLException e) {
            e.getMessage();
        }

        String selectStr = "SELECT * FROM Student WHERE name = '张三'";
        ResultSet rs = null;
        try {
            rs = sta.executeQuery(selectStr);
        } catch (SQLException e) {
            e.getMessage();
        }

        String insertStr = "INSERT INTO Major(majorID, majorName, departmentID)"
                + "values('m0006', '物联网工程', 'd0001')";
        try {
            sta.execute(insertStr);
        } catch (SQLException e) {
            e.getMessage();
        }
        try {
            while (rs.next()) {
                System.out.println("学号: " + rs.getString("no"));
                System.out.println("姓名: " + rs.getString("name"));
                System.out.println("性别: " + rs.getString("gender"));
                System.out.println("年龄: " + rs.getInt("age"));
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        try {
            rs.close();
            sta.close();
            conn.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
