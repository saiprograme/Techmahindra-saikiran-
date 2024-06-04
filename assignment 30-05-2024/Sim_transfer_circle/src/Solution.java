import java.util.*;
public class Solution {
	 public static Sim[] transferCircle(Sim[] sims, String circle1, String circle2) {
	        List<Sim> filteredList = new ArrayList<>();

	        for (Sim sim : sims) {
	            if (sim.getC().equals(circle1)) {
	                sim.setC(circle2);
	                filteredList.add(sim);
	            }
	        }

	        filteredList.sort((s1, s2) -> Double.compare(s2.getRPs(), s1.getRPs()));

	        return filteredList.toArray(new Sim[0]);
	    }
}
