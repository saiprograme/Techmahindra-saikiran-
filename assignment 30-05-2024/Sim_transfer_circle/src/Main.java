import java.util.*;
public class Main {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Sim[] sims = new Sim[5];

	        for (int i = 0; i < 5; i++) {
	            int simId = scanner.nextInt();
	            scanner.nextLine(); // consume newline
	            String customerName = scanner.nextLine();
	            double balance = scanner.nextDouble();
	            double ratePerSecond = scanner.nextDouble();
	            scanner.nextLine(); // consume newline
	            String circle = scanner.nextLine();
	            sims[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
	        }

	        String circle1 = scanner.nextLine();
	        String circle2 = scanner.nextLine();

	        Sim[] result = Solution.transferCircle(sims, circle1, circle2);

	        for (Sim sim : result) {
	            System.out.println(sim);
	        }

	        scanner.close();
	    }
	}
