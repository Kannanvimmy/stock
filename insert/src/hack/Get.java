package hack;
import java.sql.*;
public class Get {
	
	public static void main (String []args) throws Exception{
		getData ();
	}
	
	public static void getData()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/vimmy_pop";
		String username="root";
		String password="1525";
		String Query="select * from stock";
		Connection con=DriverManager. getConnection(url,username,password);
		Statement pst=con.createStatement();
		ResultSet rs=pst.executeQuery(Query);
	while(rs.next()) {
		System.out.println("product name "+rs.getString(2));
		System.out.println(" category "+rs.getString(3));
		System.out.println("quantity "+rs.getString(4));
		System.out.println(" id "+rs.getInt(1));
		System.out.println(" purchase_date "+rs.getString(5));
		System.out.println("location "+rs.getString(6));	}
		
		

		con.close();
	}

}
