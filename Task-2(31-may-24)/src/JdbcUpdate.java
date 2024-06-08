import java.sql.*;
public class JdbcUpdate {
	public static void main(String args[]) throws SQLException {
	    try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm","root","sai@1260");
		Statement stmt= con.createStatement();
		int s = stmt.executeUpdate("update employee SET empname='sai' WHERE empid='237'");
			System.out.println("Number of rows affected is" + s);
	    }//end of try
	    catch(Exception ex) {System.out.println("Driver Exception");}
	 }//end of main
}
