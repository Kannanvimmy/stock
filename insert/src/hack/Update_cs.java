package hack;
import java.sql.*;
public class Update_cs {
	
	public static void main (String []args) throws Exception{
		UpdateData ();
	}

	
	public static void UpdateData()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/java_csdls";
		String username="root";
		String password="1525";
		int CustomerID=1;
		String Query="update customer set name ='Divya' where CustomerID=1";
		Connection con=DriverManager. getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		int rows=pst.executeUpdate();
		System.out.println(rows);
		con.close();
	}

}
