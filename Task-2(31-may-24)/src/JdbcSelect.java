import java.sql.*;

public class JdbcSelect {
	
		public static void main(String args[]) {
			try{  
				Class.forName("com.mysql.cj.jdbc.Driver");  
		   	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techm","root","sai@1260");  
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from employee");  
				while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getInt(2));  
				con.close();  
				}catch(Exception e){ System.out.println(e);}  
				}  
		}


