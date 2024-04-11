package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:33061/mysql?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                "root",
                "root");
        System.out.println("与数据库连接成功");
        Statement state  = connection.createStatement();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入username");
        String un = scan.nextLine();
        System.out.println("请输入password");
        String pw = scan.nextLine();
        System.out.println("请输入nickname");
        String nn = scan.nextLine();
        System.out.println("请输入age");
        int age = scan.nextInt();

        /* INSERT INTO userinfo(username,password,nickname,age)
            VALUES('张三','123456','阿三',22)
            SELECT *
             FROM userinfo
        * */
        String sql = "INSERT INTO userinfo(username,password,nickname,age)\n" +
                "            VALUES(?,?,?,?)\n";
        //int d = state.executeUpdate(sql);//UPDATE语句
        try(PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, un);
            pstmt.setString(2, pw);
            pstmt.setString(3, nn);
            pstmt.setInt(4, age);

        int d = pstmt.executeUpdate();
        //返回值表示影响了表中多少条记录
        if(d>0){
            System.out.println("插入成功");
        }}
        connection.close();

    }

}
