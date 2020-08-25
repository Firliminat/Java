import java.util.Locale;
import java.util.Scanner;

public class Formules {

	public static void main(String[] args) {
		double x = 0.0;
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		while(x != -100.0) {
			System.out.print("Entrez un réel x (-100.0 pour sortir): ");
			x = scanner.nextDouble();
			
			System.out.print("Expression 1: ");
			if(x == 0) {
				System.out.println("indéfinie");
			} else {
				System.out.println((x / (1 - Math.exp(x))));
			}
			
			System.out.print("Expression 2: ");
			if((x <= 0) || (x == 1)) {
				System.out.println("indéfinie");
			} else {
				System.out.println((x * Math.log(x) * Math.exp(2 /(x - 1))));
			}
			
			System.out.print("Expression 3: ");
			if(0 < x && x < 8) {
				System.out.println("indéfinie");
			} else {
				System.out.println(((- x - Math.sqrt(Math.pow(x,  2) - 8 * x)) / (2 - x)));
			}
			
			System.out.print("Expression 4: ");
			if((x >= 0 && x <= 1)) {
				System.out.println("indéfinie");
			} else {
				double a = Math.sin(x) - x /20;
				double b = Math.log(Math.sqrt(Math.pow(x,  2) - 1 / x));
				if((a < 0 && b > 0) || (a > 0 && b < 0)) {
					System.out.println("indéfinie");
				}
				else {
					System.out.println(Math.sqrt(a * b));
				}
			}
		}
		
		scanner.close();
	}
}
