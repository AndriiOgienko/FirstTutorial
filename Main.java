package LoanTask;

import java.util.Scanner;

public class Main {

	public static void main(String arg[]) {
		
		System.out.println("Write the loan sum");
		Scanner in = new Scanner(System.in);
		Double l = in.nextDouble();
		Double s=l;
		System.out.println("Write the quantity of months");
		int m = in.nextInt();

		System.out.println("Write the % in a months");
		Double p = in.nextDouble();
		
		System.out.println("Debt in the beginning   " + l);

		for (int i = 1; i <= m; i++) {

		s = s-l/m;
		
		double sp = s*(p/100);
			System.out.println("Debt after a next month  "  + s + "        Prosentages to pay   " + sp);

		}

	}

}
