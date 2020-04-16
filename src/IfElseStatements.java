import java.util.Scanner;

public class IfElseStatements {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/**
		 * Healthy sleep
		 */
		int a = input.nextInt();
		int b = input.nextInt();
		int h = input.nextInt();

		if (h > b && b > a) {
			System.out.println("Excess");
		} else if (h >= a && a < b) {
			System.out.println("Normal");
		} else {
			System.out.println("Deficiency");
		}

		/**
		 * Leap year
		 */
		for (int i = 0; i <= 1; i++) {
			int year = input.nextInt();

			if (year % 4 == 0) {
				if (year % 100 != 0 || year % 400 != 0) {
					System.out.println("Regular");
				} else System.out.println("Leap");
			}
		}

	}
}
