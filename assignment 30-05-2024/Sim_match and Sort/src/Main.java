import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sim[] sims = new Sim[4];
        for (int i = 0; i < 4; i++) {
            int id = scanner.nextInt();
            scanner.nextLine(); 
            String company = scanner.nextLine();
            int balance = scanner.nextInt();
            double ratePerSecond = scanner.nextDouble();
            scanner.nextLine(); 
            String circle = scanner.nextLine();
            sims[i] = new Sim(id, company, balance, ratePerSecond, circle);
        }
        String search_circle = scanner.nextLine();
        double search_rate = scanner.nextDouble();
        Sim[] result = Solution.matchAndSort(sims, search_circle, search_rate);
        for (Sim sim : result) {
            System.out.println(sim.getID());
        }
        scanner.close();
    }
}
