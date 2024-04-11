package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo3 {
    public static void main(String[] args) {
        try( Connection connection = DBUtil.getConnection();) {
            String sql = "UPDATE userinfo " +" SET password = '6666' "+" WHERE username = 'kagami'";
            Statement statement = connection.createStatement();
            int d = statement.executeUpdate(sql);
            if (d>0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
