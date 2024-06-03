import java.util.Arrays;
import java.util.List;
public class SumofOddandEven {
public static void main(String[] args) {
	List<Integer> number=Arrays.asList(1,2,3,4,5,10);
	int odd=number.stream().mapToInt(Integer::intValue).filter(n->n%2!=0).sum();
	System.out.println("sum of odd :"+odd);
	int even=number.stream().mapToInt(Integer::intValue).filter(n->n%2==0).sum();
	System.out.println("sum of even :"+even);

	
	
	
}
}