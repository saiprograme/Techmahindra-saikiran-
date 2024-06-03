import java.util.*;
public class AverageListOfIntegers {
public static void main(String[] args) {
	List<Integer> number=Arrays.asList(1,2,3,4,5);
	double Solution=number.stream().mapToInt(Integer::intValue).average().orElse(0.0);
	System.out.println(Solution);
	
}
}
