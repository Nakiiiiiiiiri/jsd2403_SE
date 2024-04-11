package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RegDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎注册");
        System.out.println("请输入用户名");
        String username = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();
        System.out.println("请输入昵称");
        String nickname = scanner.nextLine();
        System.out.println("请输入年龄");
        int age =  scanner.nextInt();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:33061/mysql?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                "root",
                "root");
        System.out.println("与数据库连接成功");
        Statement state  = connection.createStatement();
        /*
        INSERT INTO userinfo
        VALUES('王五','123456','小王',23);
        * */

        String sql = "INSERT INTO userinfo(username,password,nickname,age)\n" +
                "        VALUES('"+username+"','"+password+"','"+nickname+"',"+age+");";
        int d = state.executeUpdate(sql);
        if(d>0)
        {
            System.out.println("插入成功");
        }
        connection.close();
    }
}
