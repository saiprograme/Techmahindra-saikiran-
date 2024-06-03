import java.util.*;
import java.util.stream.Collectors;
public class StringLoUp {
public static void main(String[] args) {
	List<String> letters=new ArrayList<>();
	letters.add("Apple");
	letters.add("Banana");
	List<String> uppercase=letters.stream().map(String::toUpperCase).collect(Collectors.toList());
	System.out.println("uppercase :"+ uppercase);
	List<String> lowercase=letters.stream().map(String::toLowerCase).collect(Collectors.toList());
	System.out.println("lowercase :"+ lowercase);
}
}
