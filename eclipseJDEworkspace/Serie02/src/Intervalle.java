import java.util.Locale;
import java.util.Scanner;

public class Intervalle {

	public static void main(String[] args) {
		double x = 0.0;
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		while(x != -100.0) {
			System.out.print("Entrez un réel x (-100.0 pour sortir): ");
			x = scanner.nextDouble();
			
			System.out.print("x ");
			
			if((2 <= x && x < 3) || (0 < x && x <= 1) || (-10 <= x && x <= -2)) {
				System.out.print("appartient");
			} else {
				System.out.print("n'appartient pas");
			}
			System.out.println(" à I");
		}
		
		scanner.close();
	}

}
