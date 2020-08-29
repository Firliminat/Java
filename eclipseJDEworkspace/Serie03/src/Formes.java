
public class Formes {

	public static void main(String[] args) {
		for(int i = 1; i < 10; ++i) {
			for(int j = 1; j < 10; ++j) {
				System.out.print(j);
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("-----");
		System.out.println("");

		for(int i = 1; i < 10; ++i) {
			for(int j = 1; j <= i; ++j) {
				System.out.print(j);
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("-----");
		System.out.println("");
		
		for(int i = 1; i < 10; ++i) {
			for(int j = 9; j > 0; --j) {
				if(j <= i) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("-----");
		System.out.println("");
		
		for(int i = 0; i < 5; ++i) {
			int debut = 5 - i;
			int fin = 5 + i;
			for(int j = 1; j < 10; ++j) {
				if(j >= debut && j <= fin) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
