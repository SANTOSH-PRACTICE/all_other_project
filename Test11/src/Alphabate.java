import java.util.Scanner;

public class Alphabate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charactor: ");
		char ch=sc.next().charAt(0);
		
		if((ch==('a'-'z'))||(ch==('A'-'Z')))
        {
	   System.out.println("alphabate");
        }
		
		else if(ch==('1'-'9'))
		{
			   System.out.println("Digit");

		}
		else
		{
			System.out.println("Spesial symbol");
		}

	}

}
