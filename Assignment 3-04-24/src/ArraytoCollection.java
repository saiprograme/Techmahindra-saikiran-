import java.util.*;
public class ArraytoCollection {
public static void main(String[] args) {
	Integer[] array= {10,20,30,40,50};

	Collection<Integer> collection2 = new ArrayList<>(Arrays.asList(array));
	System.out.println(collection2);
}
}
