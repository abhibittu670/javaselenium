package array;

import java.util.Arrays;
import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = new String[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		
		for(int i=0;i<name.length;i++)
			name[i]= sc.next();
		//name[0] = sc.next();
		//name[1] = sc.next();
		//name[2] = sc.next();
		//name[3] = sc.next();
       System.out.println(Arrays.toString(name));
       sc.close();
	}

}
