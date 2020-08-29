import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final double G = 9.81, VITESSE_DU_SON = 343.00, ACCEL_MIN = 0.5, HAUTEUR_PARACHUTE = 2500.0;
        double v0 = 0.0, t0 = 0.0;
        double surface = 2.0, vitesse = v0, hauteur = h0, accel = G, ancienneVitesse = v0, ancienneAccel = accel, ancienneHauteur = hauteur;
        double t = t0;
        
        double s = surface / masse, q = 1.0;

        
        do {
            System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);
        	++t;
        	
        	q = Math.exp(-s * (t - t0));
        	
        	ancienneVitesse = vitesse;
        	vitesse = (G / s) * (1 - q) + v0 * q;
        	
        	ancienneHauteur = hauteur;
        	hauteur = h0 - (G / s) * (t - t0) - ((v0 - (G / s)) / s) * (1 - q);
        	
        	ancienneAccel = accel;
        	accel = G - s * vitesse;

        	if(ancienneVitesse < VITESSE_DU_SON && vitesse >= VITESSE_DU_SON) {
        		System.out.println("## Felix depasse la vitesse du son");
        	}
        	if(ancienneAccel > ACCEL_MIN && accel <= ACCEL_MIN) {
        		System.out.println("## Felix a atteint sa vitesse maximale");
        	}
        	if((ancienneHauteur > HAUTEUR_PARACHUTE || t == 1) && hauteur <= HAUTEUR_PARACHUTE) {
        		System.out.println("## Felix ouvre son parachute");
        		
                surface = 25.0;
                s = surface / masse;

                h0 = hauteur;
                v0 = vitesse;
                t0 = t;
        	}
        } while(hauteur > 0);
        
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
