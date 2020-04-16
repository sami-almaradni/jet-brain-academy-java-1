import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		/**
		 * The length of the sequence
		 */
		Scanner input = new Scanner(System.in);

		int numsLength = input.nextInt();
		int[] nums = new int[numsLength];
		int i = 0;
		while (i < nums.length) {
			nums[i] = input.nextInt();
			i++;
		}

		int j = 0;

		while (nums[j] != 0) {
			if (nums[j] != 0) {
				j++;
			}
		}
		System.out.println(j);
	}
}
