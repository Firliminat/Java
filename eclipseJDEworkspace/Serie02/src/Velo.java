import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        double tauxBas = 1.0, tauxHaut = 2.0;
        int debutTauxHaut = 7, finTauxHaut = 17;
        
        if(debut < 0 || debut > 24 || fin < 0 || fin > 24) {
        	System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        } else if(debut == fin) {
        	System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        } else if(debut > fin) {
        	System.out.println("Bizarre, le début de la location est après la fin ...");
        } else {
	
	        int duree = fin - debut, dureeBas = 0, dureeHaut = 0; 
	        double prix = 0.0;
	    	
        	
        	if(debut < debutTauxHaut) {
        		if(fin <= debutTauxHaut) {
        			dureeBas = duree;
        			dureeHaut = 0;
        		} else if(fin <= finTauxHaut) {
        			dureeBas = debutTauxHaut - debut;
        			dureeHaut = fin - debutTauxHaut;
        		} else {
        			dureeBas = debutTauxHaut - debut + fin - finTauxHaut;
        			dureeHaut = finTauxHaut - debutTauxHaut;
        		}
        	} else if(debut <= finTauxHaut) {
        		if(fin <= finTauxHaut) {
        			dureeHaut = duree;
        			dureeBas = 0;
        		} else {
        			dureeHaut = finTauxHaut - debut;
        			dureeBas = fin - finTauxHaut;
        		}
        	} else {
        		dureeBas = duree;
        		dureeHaut = 0;
        	}
        	
	    	System.out.println("Vous avez loué votre vélo pendant ");
	    	if(dureeBas > 0) {
	    		System.out.println(dureeBas + " heure(s) au tarif horaire de " + tauxBas + " franc(s)");
	    	}
	    	if(dureeHaut > 0) {
	    		System.out.println(dureeHaut + " heure(s) au tarif horaire de " + tauxHaut + " franc(s)");
	    	}
        	
			prix = dureeBas * tauxBas + dureeHaut * tauxHaut;
	    
	        System.out.print("Le montant total à payer est de " + prix);
	        System.out.println(" franc(s).");
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
