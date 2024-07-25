package sundaypractice2111;

import java.util.Scanner;

public class Alphabate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter alphabate (a-z) or(A-Z)");
		char ch = sc.next().charAt(0);
		
		if((ch == 'a')||(ch =='e')||(ch == 'i')|| (ch == 'o')||(ch == 'u')||(ch == 'A')||(ch  == 'E')||(ch == 'O')||(ch == 'U')||(ch == 'I'))
			
		{
			System.out.println("charactor vowels" + ch);
			
		}
		
		else if( ((ch >= 'a')&&(ch <= 'z'))||((ch >= 'A'))&&(ch <= 'Z'))
				{
			System.out.println("charactor is consolate" +  ch);
				}
			
			
				else
				{
					System.out.println("plese select valid charactor");
				}
		
		

	}

}
