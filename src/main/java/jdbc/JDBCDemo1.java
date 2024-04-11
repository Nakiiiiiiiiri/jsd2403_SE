package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

/*使用JDBC与数据库进行操作的基本步骤：
加载驱动CLass.forName("com.mysql.jdbc.Driver")


* */
public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:33061/mysql?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                "root",
                "root");
        System.out.println("与数据库连接成功");
        Statement state  = connection.createStatement();
        /*   CREATE TABLE userinfo(
                id INT PRIMARY KEY AUTO_INCREMENT,
                username VARCHAR(30),
                password VARCHAR(30),
                nickname VARCHAR(30),
                age INT(3)
        );

         */
        String sql = "CREATE TABLE userinfo(\n" +
                "                id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                "                username VARCHAR(30),\n" +
                "                password VARCHAR(30),\n" +
                "                nickname VARCHAR(30),\n" +
                "                age INT(3)\n" +
                "        );";
        state.execute(sql);//执行
        System.out.println("执行完毕");
        connection.close();

    }
}
