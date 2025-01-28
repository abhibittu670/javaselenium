package array;

import java.util.Arrays;
import java.util.Scanner;

public class arraypractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "eye";
		String reverse = "";
		for (int i=s1.length()-1;i>=0;i--)
		{
			char c1 = s1.charAt(i);
			reverse = reverse + c1;
		}
		System.out.println(reverse);
		
		if(s1.equals(reverse))
		{
			System.out.println("given string is pallindrome");
		}
		else {
			System.out.println("given string is not pallindrome");
		}
	}

}
