//import java.util.Scanner;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {

		/**
		 *  Strings fun
		 */

		String textWithWhitespaces = "\t text with whitespaces   !\n  \t";

		System.out.println(textWithWhitespaces.trim());

		String str = "str" + 10 + false;
		System.out.println(str);

		String shortString = "str";
		long number = 100;

		String result1 = shortString + number + 50;
		String result2 = number + 50 + shortString;

		System.out.println(result1);
		System.out.println(result2);

		String first = "first";
		String second = "second";

		String anotherFirst = "first";
		String secondInUpperCase = "SECOND";

		System.out.println(first.equals(second));
		System.out.println(first.equals(anotherFirst));

		System.out.println(second.equals(secondInUpperCase));
		System.out.println(second.equalsIgnoreCase(secondInUpperCase));

		String a3 = "aaa";
		String a1 = "bca";

		System.out.println(a3.replace("a", "b"));
		System.out.println(a1.replace("a", "b"));

		String java = "Java";
		int zero = 0;
		int two = 2;
		String jav = java.substring(zero, two + 1);

		System.out.println(jav);

		Scanner input = new Scanner(System.in);

		String[] cities = new String[3];

		cities[0] = input.nextLine();
		cities[1] = input.nextLine();
		cities[2] = input.nextLine();

		for (int i = 0; i < cities.length; i++) {
			if (cities[i].endsWith("burg")) {
				System.out.println(true);
			} else System.out.println(false);
		}
		System.out.println(cities.length);

		String str2 = "a simple string";

		if (str2.startsWith("A simple")) {
			str2 = str2.substring(2, 8);
		} else {
			str2 = str2.replace("a", "A SIMPLE").substring(2, 8);
		}
		System.out.println(str2);

		System.out.println(1 + 1 + "2" + 2); // 1
		System.out.println(2 + 2 + "2"); // 2
		System.out.println("2" + 2 + 2); // 3
		System.out.println("2" + 2 + 1 + 1); // 4
	}
}
