import java.util.Locale;
import java.util.Scanner;

public class Rebonds1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);

		final double G = 9.81;
		double h = -1.0, eps = -1.0, v = 0.0;
		int nbr = -1;

		do {
			System.out.print("Entrez la hauteur initiale (h), un reel positif :");
			h = scanner.nextDouble();
		} while(h < 0.0);
		
		do {
			System.out.print("Entrez le coefficient de rebond (eps), un reel strictement compris entre 0 et 1 :");
			eps = scanner.nextDouble();
		} while(eps <= 0 || eps >= 1);
		
		do {
			System.out.print("Entrez le nombre de rebond (nbr), un entier strictement positif :");
			nbr = scanner.nextInt();
		} while(nbr < 1);
		
		scanner.close();
		
		for(int i = 0; i < nbr; ++i) {
			v = eps * Math.sqrt(2 * G * h);
			h = v * v / (2 * G);
		}

		System.out.println("La hauteur de rebond apres " + nbr + " rebonds est de : " + h);
	}

}
