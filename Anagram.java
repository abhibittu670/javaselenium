package array;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1 = "silent";
     String s2 = "listen";
      char c1[]= s1.toCharArray();
      char c2[]= s2.toCharArray();
      
      Arrays.sort(c1);
      Arrays.sort(c2);
      System.out.println(Arrays.toString(c1));
      System.out.println(Arrays.toString(c2));
      if (Arrays.equals(c1, c2))
      {
    	  System.out.println("Given string is anagram");
      }
      else {
    	  System.out.println("given string is not anagram");
      }
	}

}
