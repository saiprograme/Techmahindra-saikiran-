import java.sql.*;
public class JdbdInsert {
	static final String url="jdbc:mysql://localhost:3306/techm";
public static void main (String[] args) throws ClassNotFoundException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(url,"root" ,"sai@1260");
	    Statement stmt=conn.createStatement();
	    int result=stmt.executeUpdate("insert into employee(empname,empid) values('sandeep','237')");
	    if(result>0)
	    	System.out.println("succesfully inserter");
	    else
	    	System.out.println("unsuccesfull");
	    conn.close();
	    
	    
	
	}
	catch(SQLException e) {
		System.out.println(e);
	}
}
}
