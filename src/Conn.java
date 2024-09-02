
/*package bank.management.system;
import java.sql.*;

public class Conn {
     
    Connection c;
    Statement s;
    public Conn(){
        try{
           
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","VedikaJain");
            s=c.createStatement();
            
        } catch(Exception e){
            System.out.println(e); 
        }
    } 
}*/

package bank.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "VedikaJain");

            // Create the statement
            s = c.createStatement();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database connection failed: " + e);
        }
    }

    // Close the connection
    public void close() {
        try {
            if (s != null) s.close();
            if (c != null) c.close();
        } catch (SQLException e) {
            System.out.println("Failed to close database resources: " + e);
        }
    }
}
