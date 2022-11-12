package zadacha;

import java.util.Scanner;

public class VlojeniFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner imp = new Scanner(System.in);
		int n = imp.nextInt();
		printLine(n);
		for (int i = 0; i < n-1; i++) {
			for (int j = 1; j <= n + 1; j++) {
				if (i >= 1 && i < n - 1) {
					if (j >= 2 && j <= n) 
						System.out.print("\\/");
					if (j == 1)
						System.out.print("-");
					if (j == n + 1)
						System.out.print("-");
				}
			}
			System.out.println();
		}
		printLine(n);

	}

	private static void printLine(int n) {
		for (int k = 0; k < 2 * n; k++) {
			System.out.print("-");
		}
	}
}