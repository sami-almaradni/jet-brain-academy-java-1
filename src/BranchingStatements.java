import java.util.Scanner;

public class BranchingStatements {

	public static void main(String[] args) {

		/**
		 *  Even or odd
		 */
		Scanner input = new Scanner(System.in);

		int arrLength = input.nextInt();

		int[] arrNums = new int[arrLength];

		for (int i = 0; i < arrNums.length; i++) {
			arrNums[i] = input.nextInt();
		}

		for (int i = 0; i < arrNums.length; i++) {
			if (arrNums[i] == 0) {
				break;
			} else if (arrNums[i] % 2 == 0) {
				System.out.println("even");
			} else System.out.println("odd");
		}
	}
}
