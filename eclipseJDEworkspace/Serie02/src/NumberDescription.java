import java.util.Locale;
import java.util.Scanner;

public class NumberDescription {

	public static void main(String[] args) {
		int nb = 1;
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		while(nb != 0) {
			System.out.print("Entrez un nombre entier (0 pour sortir): ");
			nb = scanner.nextInt();
			
			System.out.print("Le nombre est ");
			
			if(nb == 0) {
				System.out.println("zéro (et il est pair)");
			} else {
				if(nb > 0) {
					System.out.print("positif ");
				} else {
					System.out.print("négatif ");
				}
				
				if(nb % 2 == 0) {
					System.out.println("et pair");
				} else {
					System.out.println("et impair");
				}
				
				System.out.println("");
			}
		}
		
		scanner.close();
	}
}
