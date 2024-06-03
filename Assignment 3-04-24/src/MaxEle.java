import java.util.Collections;
import java.util.Vector;
public class MaxEle {
public static void main(String[] args) {
	Vector<Integer>vector=new Vector<>();
	vector.add(1);
	vector.add(45);
	vector.add(67);
	int maxElement=Collections.max(vector);
	System.out.println(maxElement);
	
}
}
