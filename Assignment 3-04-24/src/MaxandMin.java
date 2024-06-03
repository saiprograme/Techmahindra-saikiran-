import java.util.*;
public class MaxandMin {
public static void main(String[] args) {
	List<Integer> num=Arrays.asList(1,5,3,8,9);
	int min=Collections.min(num);
	int max=Collections.max(num);
	
	System.out.println("The minimum is :"+" "+min);
	System.out.println("The maximum is :"+" "+max);
}
}
