import java.util.Locale;
import java.util.Scanner;

public class Pret {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);

		double s = 0.0, ir = 0.0, r = 0.0, t = 0.0;

		do {
			System.out.print("Entrez la somme q rembourser (s), un reel strictement positif :");
			s = scanner.nextDouble();
		} while(s <= 0.0);
		
		do {
			System.out.print("Entrez le montant rembourse mensuellement (r), un reel strictement positif :");
			r = scanner.nextDouble();
		} while(r <= 0);
		
		do {
			System.out.print("Entrez le tqux d'interet (ir), un reel strictement compris entre 0 et 1 :");
			ir = scanner.nextDouble();
		} while(ir <= 0.0 || ir >= 1);
		
		scanner.close();
		
		do {
			t += ir * s;
			s = s - r;
		} while (s > 0);

		System.out.println("Le montant total des interets est : " + t);
	}

}
