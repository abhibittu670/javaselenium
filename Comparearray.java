package array;
/*compariosn of two array is same or not 
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class Comparearray {

	public static void main(String[] args) {
		int rollno[] = new int[4];
		int rollno1[] = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of rollno and rollno 1");

		System.out.println("Enter values for rollno array:");
		for (int i = 0; i < 4; i++) {
			rollno[i] = sc.nextInt(); // Fill rollno array
		}

		System.out.println("Enter values for rollno1 array:");
		for (int i = 0; i < 4; i++) {
			rollno1[i] = sc.nextInt(); // Fill rollno1 array
		}
		sc.close();

		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno1));

		boolean answer = Arrays.equals(rollno, rollno1);

		if (answer == true) {
			System.out.println("Both roll no are same");
		} else {
			System.out.println("Both roll are not same");
		}
	}

}
