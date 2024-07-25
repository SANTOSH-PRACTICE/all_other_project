package practics;

import java.util.Scanner;

public class MathsOperation {
	int choice;
	void display()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("***WELCOME***");
		do
		{
			System.out.println("Enter option:");
			System.out.println("1.ADDITION");
			System.out.println("2.SUBTRACTION");
			System.out.println("3.MULTIFICATION");
			System.out.println("4.QUIT");
			int num1, num2,result;
		int	choice=sc.nextInt() ;
		
			switch(choice)
			{
			case 1: System.out.println("Enter number1:");
			        num1=sc.nextInt();
			        System.out.println("Enter number2:");
			        num2=sc.nextInt();
			        result=num1+num2;
			        System.out.println("addition is:"+result);
			        break;
			case 2: System.out.println("Enter number1:");
	                num1=sc.nextInt();
	                System.out.println("Enter number2:");
	                num2=sc.nextInt();
	                result=num1-num2;
	                System.out.println("subtraction is:"+result);
	                break;
	        
			case 3: System.out.println("Enter number1:");
	                num1=sc.nextInt();
	                System.out.println("Enter number2:");
	                num2=sc.nextInt();
	                result=num1*num2;
	                System.out.println("multification is:"+result);
	                break;  
			case 4:System.out.println("Exiting....");  
			        break;
			        
			        default:System.out.println("select correct option");
			
		
			}
		
	}
		while(choice !=4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
