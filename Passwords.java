package FirstTerm;
import java.util.Scanner;

public class Passwords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int L = scanner.nextInt();

		String output = "";
		for (int i = 1; i < n; i++) {
			output = Integer.toString(i);
			for (int j = 1; j <= n; j++) {
				output += Integer.toString(j);
				for (char k = 'a'; k < (int) 'a' + L; k++) {
					output += k;
					for (char l = 'a'; l < (int) 'a' + L; l++) {
						output += l;
						for (int m = 1; m <= n; m++) {
							if (m > i && m > j) {
								output += Integer.toString(m);
								System.out.print(output + " ");
							}
							output = output.substring(0, 4);
						}
						output = output.substring(0, 3);
					}
					output = output.substring(0, 2);
				}
				output = output.substring(0, 1);
			}
		}
		scanner.close();
	}
}
