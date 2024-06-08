import java.sql.*;
public class JdbcDelete {
	public static void main(String args[]) throws SQLException {
	    try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm","root","sai@1260");
		Statement stmt= con.createStatement();
			String str="sai";
			int s = stmt.executeUpdate("delete from employee where empname='" + str + "'");
			System.out.println("Number of rows affected is" + s);
	    }//end of try
	    catch(Exception ex) {System.out.println("Driver Exception");}
	 }//end of main
}
