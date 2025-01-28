package array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int rollno[] = new int[3];
		rollno[0] = 74;
		rollno[1] = 76;
		rollno[2] = 75;
		for (int i = 0; i <=2; i++)
			System.out.println(rollno[i]);

	}
*/	
	// This code print the string array	
	String name[] = new String[3];
	name[0] = "Abhishek";
	name[1] = "Bittu";
	name[2] = "Ravi";
	for (int i = 0; i <=2; i++)
	{
		System.out.println(name[i]);
	}
	
	// This code print the char array
	char initialsname[] = new char[3];
	initialsname[0] = 'A';
	initialsname[1] = 'K';
	initialsname[2] = 'S';
	//for (int i = 0; i <=2; i++)
	{
		System.out.println(Arrays.toString(initialsname));
	}
}
}