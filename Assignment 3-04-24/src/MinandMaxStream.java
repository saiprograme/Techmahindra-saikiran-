import java.util.*;
public class MinandMaxStream {
public static void main(String[] args) {
	List<Integer> number=Arrays.asList(1,2,3,67,8);
	OptionalInt min=number.stream().mapToInt(Integer::intValue).min();
	OptionalInt max=number.stream().mapToInt(Integer::intValue).max();
	System.out.println("minimum is :"+ min+"maximum is :" + max);
	
	
}
}
