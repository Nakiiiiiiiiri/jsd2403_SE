package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo7 {
    public static void main(String[] args) {try(Connection connection = DBUtil1.getConnection();) {

        Statement statement = connection.createStatement();
        String sql = "SELECT COUNT(*) count "+
                " FROM class c"+" JOIN student s on s.class_id = c.id"
                +" WHERE c.name = '1年级1班'";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            int count = rs.getInt("count");
            System.out.println("人数："+count);

        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    }
}
