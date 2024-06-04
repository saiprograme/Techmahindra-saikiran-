import java.util.*;
public class VowelC {
public static void main(String[] args) {
	String s;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	s=sc.nextLine();
	
	System.out.println(s);
	int vowelcount=0,constcount=0;
	String vowels="aeiouAEIOU";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(Character.isLetter(ch)) {
			if(vowels.indexOf(ch)!=-1) {
				vowelcount++;
			}else {
				constcount++;
			}
	}
	
}
	System.out.println("Vowelcount= "+ vowelcount);
	System.out.println("constcount= "+constcount);
}
}