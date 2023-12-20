
package demodforsql;


import java.sql.*;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DemodForsql {

   
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
       //Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","");
//        Statement statement=conn.createStatement();
//        String q="insert into student values('raju',10011,'domar','rahu@gmail.com')";
//        statement.executeUpdate(q);
//        ResultSet rs=statement.executeQuery("select * from student");
//        while(rs.next())
//        {
//            System.out.print(rs.getInt("id")+" -> ");
//            System.out.print(rs.getString("name")+" -> ");
//            System.out.print(rs.getString("address")+" -> ");
//            System.out.println(rs.getString("email"));
//        }

     
        DatabaseAction st=new DatabaseAction();
        List<Student> std=st.getAllStudent();
     
        for(Student u:std)
        {
            System.out.println(u.name+" "+u.id+" "+u.address+" "+u.email);
        }



        
    }
    
}
