/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotellerio;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Vishnu Vardhan CH
 */
public class DBConnect {
    Connection con;
    public void connect() {
        try {
            DBConnect dbc = new DBConnect();
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306:/for_hotellerio";
            String user = "root";
            String pass = "1.414magiC";
            dbc.con = DriverManager.getConnection(url,user,pass);
            System.out.println("database connected");
        } 
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("not connected to database");
        }
        
    }
    public void close()
    {
        DBConnect dbc1=new DBConnect();
        try{dbc1.con.close();}
        catch (SQLException e1)
        {
            System.out.println(e1);
        }
    }
}
