package hack;
import java.sql.*;
public class Update {
	
	public static void main (String []args) throws Exception{
		UpdateData ();
	}

	
	public static void UpdateData()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/vimmy_pop";
		String username="root";
		String password="1525";
		int id=1;
		String Query="update stock set product_name ='Oppo' where Id=1";
		Connection con=DriverManager. getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		int rows=pst.executeUpdate();
		System.out.println(rows);
		con.close();
	}

}
