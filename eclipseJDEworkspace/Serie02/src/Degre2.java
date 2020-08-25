import java.util.Locale;
import java.util.Scanner;

public class Degre2 {

	public static void main(String[] args) {
		double a = 0.0, b = 0.0, c = 0.0;
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		// Tant que a est nul, demander une valeur a l'utilisateur
		while (a == 0.0) {
			System.out.print("Entrez une valeur non nulle pour a :");
			a = scanner.nextDouble();
		}
		
		System.out.print("Entrez une valeur pour b:");
		b = scanner.nextDouble();
		System.out.print("Entrez une valeur pour c:");
		c = scanner.nextDouble();
		scanner.close();

		double delta = b * b - 4.0 * a * c;
		
		if (delta < 0.0) {
			System.out.println("Pas de solutions reelles");
		} else if (delta > 0.0) {
			System.out.println("Deux solutions : " + (-b - Math.sqrt(delta)) / (2.0 * a) + " et " + (-b + Math.sqrt(delta)) / (2.0 * a));
		} else {
			System.out.println("Une solution unique : " + -b / (2.0 * a));
		}
	}

}
