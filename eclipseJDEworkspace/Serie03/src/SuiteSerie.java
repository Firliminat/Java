public class SuiteSerie {

	public static void main(String[] args) {
		double u = 1.0, v = u;
		final int N_MAX = 10;
		
		for(int n = 0; n < N_MAX; n++) {
			System.out.print("U" + n + " = " + u);
			System.out.println("| V" + n + " = " + v);
			u = u / (n + 1);
			v += u;
		}

		System.out.print("U" + N_MAX + " = " + u);
		System.out.println("| V" + N_MAX + " = " + v);
	}

}
