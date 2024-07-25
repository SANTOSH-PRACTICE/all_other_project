package sundaypractice2111;

import java.util.Scanner;

public class mathsswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int number1,number2;
		
		System.out.println("enter number1:");
		number1=sc.nextInt();
		
		System.out.println("enter number2:");
		number2=sc.nextInt();
		
		System.out.println("select correct:");
		System.out.println("add.'=' /sub.'-'/mul.'*'or div.'/'");
		char ch =sc.next().charAt(0);
		
		
		switch(ch)
		{
		case '+' :System.out.println("addition is" +(number1+number2));
		          break;
		          
		          
		case '-' :System.out.println("subtraction is" +(number1-number2));
        break;

        
		case '*' :System.out.println("multification is" +(number1*number2));
        break;

        
		case '/' :System.out.println("divion is"  +(number1/number2));
        break;
        
        default : System.out.println("choose correct option");

		}
		
		
		


	}

}
