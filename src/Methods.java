import java.util.Scanner;

public class Methods {

	/**
	 * Integer part of a number
	 * @param d: decimal number
	 * @return: converted d to int
	 */
	public static int extractInt(double d) {
		int fullNum = (int)d;
		return fullNum;
	}

	/**
	 * Vowel or not
	 * @param ch: char from main method
	 * @return: boolean
	 */
	public static boolean isVowel(char ch) {
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		boolean isVowels = false;
		for (int i = 0; i < vowels.length; i++) {
			if (ch == vowels[i]) {
				isVowels = true;
			}
		}
		return isVowels;
	}

	/**
	 * The method calculates the sum of integers in a given range
	 *
	 * @param from inclusive
	 * @param to exclusive
	 *
	 * @return the sum (long)
	 */
	public static long sumInRange(int from, int to) {
		long rangeSum = 0;
		while (from < to) {
			if (to - from == 1) {
				rangeSum += from;
				break;
			}
			rangeSum += from;
			from++;
		}
		return rangeSum;
	}

	public static void main(String[] args) {

		final Scanner scanner = new Scanner(System.in);

		final double d = scanner.nextDouble();
		System.out.println(extractInt(d));

		char letter = scanner.nextLine().charAt(0);
		System.out.println(isVowel(letter) ? "YES" : "NO");


		int from = scanner.nextInt();
		int to = scanner.nextInt();
		System.out.println(sumInRange(from, to));
	}
}
