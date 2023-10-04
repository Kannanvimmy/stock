import java.sql.*;
public class Insert {
	
	public static void main (String []args) throws Exception{
		insertData ();
	}
	
	public static void insertData() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/vimmy_pop";
		String username= "root";
		String password= "1525";
		String Query= "insert into stock values (?,?,?,?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement Pst = con.prepareStatement(Query);
		Pst.setInt(1,005);
		Pst.setString(2,"chocolate truffle");
		Pst.setString(3, "cake");
		Pst.setInt(4, 3);
		Pst.setString(5, "05.10.2023");
		Pst.setString(6, "Guindy");
		Pst.executeUpdate();
		con.close();
		
	}

}
 