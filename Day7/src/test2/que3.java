package test2;

import java.util.Scanner;

public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		char ch;
		System.out.println("enter the charactor (a-z)&(A-Z):");
		ch=sc.next().charAt(0);
		
		if((ch =='a')||(ch=='e')||(ch=='o')||(ch=='i')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='O')||(ch=='I')||(ch=='U'))
		{
		System.out.println("charactor is vowel");
		}
		else 
		{
			System.out.println("charactor is consols");
		}
	}

}
