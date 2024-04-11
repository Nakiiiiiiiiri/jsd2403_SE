package jdbc;

import com.sun.org.apache.regexp.internal.RE;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDemo {
    public static void main(String[] args) {
        try(Connection connection = DBUtil.getConnection();) {
            User user = InputUtil.getInputObject(new User(),"登录","登录");

            Statement statement = connection.createStatement();
            String sql = "SELECT *"+
                    " FROM userinfo"+
                    " WHERE username = '"+user.getUsername()+"'"+
                    " AND password = '"+user.getPassword()+"'";
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                System.out.println("登陆成功");
            }else {
                System.out.println("登录失败，账号或密码错误");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
