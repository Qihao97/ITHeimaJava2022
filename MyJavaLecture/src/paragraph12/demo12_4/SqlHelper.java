package paragraph12.demo12_4;

import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.Base64;

/**
 * @Author: Qihao
 * @Time: 11/14/2023 7:41 PM
 * @Descriptions: SqlHelper
 */
public class SqlHelper {
    // 定义需要的对象
    private Connection conn = null;
    private Statement st = null;
    private ResultSet rs = null;

    // 连接数据库需要的字符串
    final Base64.Decoder decoder = Base64.getDecoder();
    final Base64.Encoder encoder = Base64.getEncoder();
    //声明JDBC驱动对象
    String jdDriver = "com.mysql.cj.jdbc.Driver";
    //声明JDBC的URL
    String url = "jdbc:mysql://172.30.128.209/test";
    String user = new String(decoder.decode("amF2YVRFU1Q="), "UTF-8");
    String pwd = new String(decoder.decode("UXdlcnRfMjAyMw=="), "UTF-8");

    //构造函数，初始化conn
    public SqlHelper() throws UnsupportedEncodingException {
        try {
            Class.forName(jdDriver);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + "驱动加载失败");
            //e.printStackTrace();
            //System.out.println("驱动没有加载成功,原因是没有导入驱动！请检查");
        }
        try {
            //连接数据库
            conn = DriverManager.getConnection(url, user, pwd);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "数据库打开失败");
            //e.printStackTrace();
            //System.out.println("数据库服务没有开启，请打开数据库服务，再重试");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }

    // 关闭资源的方法
    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }

            if (st != null) {
                st.close();
            }

            if (conn != null) {
                conn.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 查询
    public ResultSet query(String sql) {
        try {
            st = conn.createStatement();
            // 执行查询
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 返回结果集
        return rs;
    }

    // 增删改方法
    public boolean update(String sql) {

        boolean b = true;
        try {

            st = conn.createStatement();

            st.executeUpdate(sql);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("SqlHelper中增删改中出错啦，请检查！");
            b = false;
        }
        return b;
    }

    /*public static void main(String[] args){
        String strSel = "SELECT * FROM viStudent";
        SqlHelper sh = new SqlHelper();
        ResultSet rs = sh.query(strSel);
        System.out.println("Test.ok 5");

        try{
            while(rs.next()){
                System.out.println(rs.getString("学号"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        System.out.println("Test.ok 6");
        try{
            rs.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        sh.close();
    }*/
}
