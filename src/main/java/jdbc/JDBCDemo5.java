package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo5 {
    public static void main(String[] args) {
        try(Connection connection = DBUtil.getConnection()) {

            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM userinfo";
            ResultSet rs = statement.executeQuery(sql);//返回一个结果集
            while (rs.next()){//指针下移并为一个boolean
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String nickname = rs.getString("nickname");
                int age = rs.getInt("age");
                System.out.println(id+"用户名："+username+"密码："+password+"昵称："+nickname+"年龄："+age);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
