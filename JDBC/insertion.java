Type1 :
public class Hello {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
      String url="jdbc:mysql://localhost:3306/kavya";
      String username="root";
      String password="password";
      try
      {
          Connection conn=DriverManager.getConnection(url,username,password);
          String qu="insert into employees values('8','Kavya', '2019-02-10')";
          Statement st= conn.createStatement();
          int rs=st.executeUpdate(qu);
      }
      catch (SQLException e)
      {
          System.out.println(e.getMessage());
      }
    }
}
Type 2:


String url="jdbc:mysql://localhost:3306/kavya";
      String username="root";
      String password="password";
      String name="kittu";
      int id=6;
      String date="23-11-2012";
      try
      {
          Connection conn=DriverManager.getConnection(url,username,password);
          String qu="insert into employees values("+id+",'"+name+"','"+date+"')";
          Statement st= conn.createStatement();
          int rs=st.executeUpdate(qu);
      }
      catch (SQLException e)
      {
          System.out.println(e.getMessage());
      }




Type
