import java.util.Scanner;

public class Champi {

	public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        final String L = "Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ";
        final String F = "Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ";
        final String C = "Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ";
        final String A = "Est-ce que votre champignon a un anneau (true : oui, false : non) ? ";
		final String AJ = "l'agaric jaunissant", AT = "l'amanite tue-mouches", CB = "le cèpe de Bordeaux";
		final String CC = "le coprin chevelu", GI = "la girolle", PB = "le pied bleu";
		
		String champignon = "";
        
		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
		System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
		
		System.out.println("");


		System.out.print(A);
		if(clavier.nextBoolean()) {
			System.out.print(C);
			if(clavier.nextBoolean()) {
				System.out.print(F);
				if(clavier.nextBoolean()) {
					champignon = AT;
				} else {
					champignon = AJ;
				}
			} else {
				champignon = CC;
			}
		} else {
			System.out.print(C);
			if(clavier.nextBoolean()) {
				champignon = PB;
			} else {
				System.out.print(L);
				if(clavier.nextBoolean()) {
					champignon = GI;
				} else {
					champignon = CB;
				}
			}
		}
		
        clavier.close();
        
		System.out.print("==> Le champignon auquel vous pensez est " + champignon + ".");
	}

}
