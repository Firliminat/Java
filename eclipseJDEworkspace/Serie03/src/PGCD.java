import java.util.Locale;
import java.util.Scanner;

public class PGCD {

	public static void main(String[] args) {
		int a = 0, b = 0, tmp = 0;
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);

		do {
			System.out.print("Entrez un nombre strictement positif (a) :");
			a = scanner.nextInt();
		} while(a < 1);
		do {
			System.out.print("Entrez un nombre strictement positif (b) :");
			b = scanner.nextInt();
		} while(b < 1);
		
		scanner.close();
		
		while(a != b) {
			if(a > b) {
				a = a - b;
			} else {
				tmp = a;
				a = b;
				b = tmp;
			}
		}
		

		System.out.println(a);
	}

}
