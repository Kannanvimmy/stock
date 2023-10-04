package hack;
import java.sql.*;
public class Insert_cs {
	
	public static void main (String []args) throws Exception{
		insertData ();
	}
	
	public static void insertData() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/java_csdls";
		String username= "root";
		String password= "1525";
		String Query= "insert into customer values (?,?,?,?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement Pst = con.prepareStatement(Query);
		Pst.setInt(1,005);
		Pst.setString(2,"Priya");
		Pst.setString(3, "priya@gmail.com");
		Pst.setString(4, "9749846735");
		Pst.setString(5, "perambur");
		Pst.setString(6, "2005-10-20");
		Pst.executeUpdate();
		con.close();
		
	}

}
