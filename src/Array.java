import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        /**
         *  Mystery of the array
         */
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 6;
        n = arr[arr[n]];

        System.out.println(n);

        /**
         *  Initializing an array of integers
         */
        int[] numbers = {12, 17, 8, 101, 33}; // initialize the array

        /**
         *  Determine the output
         */
        int nums[] = { 1, 2, 3, 4, 5 };
        Arrays.fill(nums, 1, 5, 10);
        System.out.println(Arrays.toString(nums));
    }
}
