import java.sql.*;

public class Hello {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
      String url="jdbc:mysql://localhost:3306/kavya";
      String username="root";
      String password="password";
      try
      {
          Connection conn=DriverManager.getConnection(url,username,password);
          String qu="select * from employees";
          Statement st= conn.createStatement();
          ResultSet rs=st.executeQuery(qu);


          while(rs.next()) {

              System.out.println("connected to database");
              System.out.println(rs.getString(2));
          }

      }
      catch (SQLException e)
      {
          System.out.println(e.getMessage());
      }
    }
}
