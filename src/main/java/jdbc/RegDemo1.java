package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        User user = InputUtil.getInputObject(new User(),"欢迎注册");
        System.out.println(user);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:33061/mysql?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                "root",
                "root");
        System.out.println("与数据库连接成功");
        Statement state  = connection.createStatement();
        String sql = "INSERT INTO userinfo(username,password,nickname,age) " +
                "VALUES('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getNickname()+"',"+user.getAge()+")";
        int d = state.executeUpdate(sql);
        if(d>0){
            System.out.println("插入成功");
        }
        connection.close();
    }
}
