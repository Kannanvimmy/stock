package hack;
import java.sql.*;
public class Get_cs {
	
	public static void main (String []args) throws Exception{
		getData ();
	}
	
	public static void getData()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/java_csdls";
		String username="root";
		String password="1525";
		String Query="select * from customer";
		Connection con=DriverManager. getConnection(url,username,password);
		Statement pst=con.createStatement();
		ResultSet rs=pst.executeQuery(Query);
	while(rs.next()) {
		System.out.println(" Name "+rs.getString(2));
		System.out.println(" Email "+rs.getString(3));
		System.out.println(" Phone "+rs.getString(4));
		System.out.println(" CustomerID "+rs.getInt(1));
		System.out.println(" City "+rs.getString(5));
		System.out.println(" purchase_Date "+rs.getString(6));	}
		
		

		con.close();
	}

}
