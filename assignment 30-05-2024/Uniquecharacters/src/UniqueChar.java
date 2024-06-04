import java.util.*;
public class UniqueChar {
public static void main(String[] args) {
	String s;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string :");
	s=sc.next();

	int arr[]=new int[26];
	Arrays.fill(arr,0);
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		arr[ch-'a']++;
	}
	String result="";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(arr[ch-'a']>0) {
			result=result+ch;
			arr[ch-'a']=0;
		}
	}
	System.out.println(result);
}

}
