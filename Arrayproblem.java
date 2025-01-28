package array;

import java.util.Arrays;

public class Arrayproblem {

	static int countofalphabet = 0;
	static int countofdigit = 0;
	static int countofspace = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Kv no 2 %^%^";
		boolean b4 = input.isEmpty();
		if (b4 == true) {
			System.out.println("String is empty so no action is performed");
		}

		else {

			char[] c1 = input.toCharArray();
			System.out.println(Arrays.toString(c1));

			for (int i = 0; i < c1.length; i++) {
				boolean b1 = Character.isAlphabetic(c1[i]);
				if (b1 == true) {
					countofalphabet++;
				}
				boolean b2 = Character.isDigit(c1[i]);
				if (b2 == true) {
					countofdigit++;
				}

				boolean b3 = Character.isWhitespace(c1[i]);
				if (b3 == true) {
					countofspace++;
				}
			}
			System.out.println("The count of alphabet in given string is " + countofalphabet);
			System.out.println("The count of alphabet in given string is " + countofdigit);
			System.out.println("The count of alphabet in given string is " + countofspace);

			int countofSpecialcharacters = c1.length - (countofspace + countofdigit + countofalphabet);
			System.out.println("The count of special character will be " + countofSpecialcharacters);

		}

	}
}