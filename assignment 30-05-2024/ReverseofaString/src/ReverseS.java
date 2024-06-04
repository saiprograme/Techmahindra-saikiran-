import java.util.*;
public class ReverseS {
public static void main(String[]args) {
	String s;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string :");
	s=sc.next();
	s=s.toLowerCase();
	
    String reversed = new StringBuilder(s).reverse().toString();
    System.out.println(reversed);
}
}
