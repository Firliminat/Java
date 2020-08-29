import java.util.Locale;
import java.util.Scanner;

public class Rebonds2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);

		final double G = 9.81;
		double h = -1.0, eps = -1.0, v = 0.0, h_fin = 0.0;
		int nbr = 0;

		do {
			System.out.print("Entrez la hauteur initiale (h), un reel positif :");
			h = scanner.nextDouble();
		} while(h < 0.0);
		
		do {
			System.out.print("Entrez le coefficient de rebond (eps), un reel strictement compris entre 0 et 1 :");
			eps = scanner.nextDouble();
		} while(eps <= 0 || eps >= 1);
		
		do {
			System.out.print("Entrez la hauteur minimale d'un rebond (h_fin), un reel strictement compris entre 0 et h :");
			h_fin = scanner.nextDouble();
		} while(h_fin <= 0.0 || h_fin >= h);
		
		scanner.close();
		
		do {
			v = eps * Math.sqrt(2 * G * h);
			h = v * v / (2 * G);
			++nbr;
		} while (h >= h_fin);

		System.out.println("Il faut " + nbr + " rebonds pour aateindre un hauteur de rebonds inferieur a la hauteur donnee (h_fin) : " + h_fin);
	}

}
