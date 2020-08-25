import java.util.Locale;
import java.util.Scanner;

public class Degre3 {

	public static void main(String[] args) {
		double a0 = 1.0, a1 = 0.0, a2 = 0.0;
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		while(a0 != 0.0 || a1 != 0.0 || a2 != 0.0 ) {
			System.out.print("Entrez une valeure réelle pour le coefficient a0 (a0 = a1 = a2 = 0.0 pour sortir): ");
			a0 = scanner.nextDouble();
			System.out.print("Entrez une valeure réelle pour le coefficient a1: ");
			a1 = scanner.nextDouble();
			System.out.print("Entrez une valeure réelle pour le coefficient a2: ");
			a2 = scanner.nextDouble();
			
			double q = (3 * a1 - Math.pow(a2,  2)) / 9;
			double r = (9 * a2 * a1 - 27 * a0 - 2 * Math.pow(a2, 3)) / 54;
			double d = Math.pow(q,  3) + Math.pow(r,  2);
			
			if(d < 0) {
				System.out.println("Il y a 3 solutions réelles:");
				
				double theta = Math.acos(r / Math.sqrt(-Math.pow(q, 3)));
				
				System.out.println((2 * Math.sqrt(-q) * Math.cos(theta / 3) - a2 / 3));
				System.out.println((2 * Math.sqrt(-q) * Math.cos((theta + 2 * Math.PI) / 3) - a2 / 3));
				System.out.println((2 * Math.sqrt(-q) * Math.cos((theta + 4 * Math.PI) / 3) - a2 / 3));
			} else {
				double s = r + Math.sqrt(d);
				double t = r + Math.sqrt(d);
				
				if(s <= 0 ) {
					s = -Math.pow(-s, 1.0 / 3.0);
				} else {
					s = Math.pow(s, 1.0 / 3.0);
				}

				if(t <= 0 ) {
					t = -Math.pow(-t, 1.0 / 3.0);
				} else {
					t = Math.pow(t, 1.0 / 3.0);
				}
				
				double u = s + t;
				
				if(d == 0 && u != 0) {
					System.out.println("Il y a 2 solutions réelles:");

					System.out.println(u - a2 / 3);
					System.out.println(- u / 2 - a2 / 3);
				} else {
					System.out.println("Il y a 1 solution réelle:");

					System.out.println(u - a2 / 3);
				}
			}
			
		}
		
		scanner.close();

	}

}
