package hack;
import java.sql.*;
public class Delete {
	
	public static void main (String []args) throws Exception{
		DeleteData ();
	}

	
	public static void DeleteData()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/vimmy_pop";
		String username="root";
		String password="1525";
		int id=2;
		String Query= "Delete from stock where id=2";
		Connection con=DriverManager. getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		int rows=pst.executeUpdate();
		System.out.println(rows);
		con.close();
	}

}
