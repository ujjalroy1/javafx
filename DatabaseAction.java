
package demodforsql;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class DatabaseAction
{
    
      Connection getConnection() throws SQLException, ClassNotFoundException
      {
            Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","");
         
          return conn;
      }
      List<Student> getAllStudent() throws SQLException, ClassNotFoundException
      {
           String q="select*from student";
          List<Student> stdlist=new ArrayList();
          Connection conn=getConnection();
          Statement statement=conn.createStatement();
          ResultSet rs=statement.executeQuery("select * from student");
          while(rs.next())
          {
              int id;
              String name,address,email;
              id=rs.getInt("id");
              name=rs.getString("name");
              address=rs.getString("address");
              email=rs.getString("email");
              Student st=new Student(name,id,address,email);
              stdlist.add(st);
          }
          
          
          
          return stdlist;
      }
}
