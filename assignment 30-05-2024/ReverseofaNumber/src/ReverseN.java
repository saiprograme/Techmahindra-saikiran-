import java.util.*;
public class ReverseN {
public static void main(String[]args) {
	int number;
	System.out.println("Enter the number :");
	Scanner sc=new Scanner(System.in);
	number=sc.nextInt();
	int RN=0;
	while(number!=0) {
		int lastD=number%10;
		RN=RN*10+lastD;
		number=number/10;
	}
	System.out.println(RN);
}
}
