package hack;
import java.sql.*;
public class delete_cs {
	
	public static void main (String []args) throws Exception{
		DeleteData ();
	}

	
	public static void DeleteData()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/java_csdls";
		String username="root";
		String password="1525";
		int  CustomerID=2;
		String Query= "Delete from customer where  CustomerID=2";
		Connection con=DriverManager. getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		int rows=pst.executeUpdate();
		System.out.println(rows);
		con.close();
	}

}
