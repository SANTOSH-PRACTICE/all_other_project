package basicprogram;

import java.util.Scanner;

public class charactorsearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter charactor between range (a-z) or(A-Z)");
		char ch = sc.next().charAt(0);
		
		
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
		{ 
			System.out.println("Entered variableis vowel");
		}
		
		else
			{System.out.println("Entered variableis consonant");

		}
	}

}
