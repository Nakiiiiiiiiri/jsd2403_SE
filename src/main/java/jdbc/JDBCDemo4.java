package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo4 {
    public static void main(String[] args) {
        try (Connection connection = DBUtil.getConnection();){

            Statement statement = connection.createStatement();
            String sql = "DELETE FROM userinfo"+" WHERE username = '张三'";
            int d = statement.executeUpdate(sql);
            if(d>0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
