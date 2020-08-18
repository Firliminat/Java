import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Age {
	
	public static void main(String[] args) {
		
		final int YEAR = LocalDate.now().getYear();
		int age = 30;
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		System.out.print("Donnez votre age : ");
		age = scanner.nextInt();
		
		scanner.close();
		
		int birthYear = YEAR - age;
		
		System.out.println("Votre annee de naissance est : " + birthYear);
	}
	
}