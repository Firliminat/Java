import java.util.Locale;
import java.util.Scanner;

public class RoseBlanches {

	public static void main(String[] args) {
		final int PRIX_CAFE = 2, PRIX_MAG = 4, PRIX_METRO = 3; 
		int montantRecu = 800, montantLivres, montantAutre;
		int nbCafe, nbMag, nbMetro;
		int montantRoses = 0;
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		System.out.print("Combien avez-vous reçu d'argent (Frs)? ");
		montantRecu = scanner.nextInt();

		scanner.close();
		
		montantLivres = montantRecu * 3 / 4;
		montantAutre = montantRecu - montantLivres;
		
		int tiersAutre = montantAutre / 3;
		montantRoses = montantAutre % 3;
		
		nbCafe = tiersAutre / PRIX_CAFE;
		montantRoses += tiersAutre % PRIX_CAFE;
		nbMag = tiersAutre / PRIX_MAG;
		montantRoses += tiersAutre % PRIX_MAG;
		nbMetro = tiersAutre / PRIX_METRO;
		montantRoses += tiersAutre % PRIX_METRO;

		System.out.println("Livre et Fournitures: " + montantLivres + " Frs");
		System.out.println("Vous pouvez ensuite acheter:");
		System.out.println(" " + nbCafe + " cafes");
		System.out.println(" " + nbMag + " numeros du Flash Informatique");
		System.out.println(" " + nbMetro + " billets de metro");
		System.out.println("et il vous restera " + montantRoses + " Frs pour les roses blanches.");
	}

}
