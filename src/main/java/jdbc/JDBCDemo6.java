package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo6 {
    public static void main(String[] args) {
        try(Connection connection = DBUtil1.getConnection();) {

            Statement statement = connection.createStatement();
            String sql = "SELECT t.name,t.gender,c.name,c.floor FROM teacher t "
                    +" JOIN class c ON t.id = c.teacher_id"
                    +" WHERE t.name = '王克晶'";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                String name = rs.getString("t.name");
                String gender = rs.getString("t.gender");
                String cname = rs.getString("c.name");
                String floor = rs.getString("c.floor");
                System.out.println(name+gender+cname+floor);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
