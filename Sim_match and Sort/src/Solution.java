import java.util.*;
public class Solution {
	  public static Sim[] matchAndSort(Sim[] sims, String search_circle, double search_rate) {

	        List<Sim> filteredList = new ArrayList<>();
	        for (Sim sim : sims) {
	            if (sim.getCircle().equals(search_circle) && sim.getRps() < search_rate) {
	                filteredList.add(sim);
	            }
	        }     
	        filteredList.sort((s1, s2) -> Integer.compare(s2.getBal(), s1.getBal()));
	        Sim[] resultArray = new Sim[filteredList.size()];
	        return filteredList.toArray(resultArray);
	    }
}
