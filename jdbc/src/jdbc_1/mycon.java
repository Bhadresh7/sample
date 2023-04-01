package jdbc_1;

import java.sql.*;
public class mycon {

	public static void main(String[] args) 
	{
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","bhadresh"); 
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from data_1");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5));  
			con.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}  
}


