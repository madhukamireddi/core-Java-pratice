// javac -cp "path/to/mysql-connector-java-8.x.x.jar" firstjdbc.java
// java -cp ".:path/to/mysql-connector-java-8.x.x.jar" JDBC.firstjdbc

import java.sql.*;
public class firstjdbc {
    public static void main(String[] args) throws Exception {
        String url ="jdbc:mysql://localhost:3306/collage";
        String uname = "root";
        String pass ="Madhu@2001";
        String query = "select * from mca";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st =  con.createStatement();
        ResultSet rs = st.executeQuery(query);

        
        while(rs.next())
        {
            String name = rs.getString("name");
            System.out.println(name);
        }
        st.close();
        con.close();
  
    }
    
}
