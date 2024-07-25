package test2;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int marathi,hindi,eng,maths,ssc;
		System.out.println("Enter the marks marathi:");
		marathi =sc.nextInt();

		System.out.println("Enter the marks hindi:");
		hindi =sc.nextInt();
		
		System.out.println("Enter the marks english:");
		eng =sc.nextInt();
		
		System.out.println("Enter the marks maths:");
		maths =sc.nextInt();
		
		System.out.println("Enter the marks social science:");
		ssc =sc.nextInt();
		int totalobtmarks=(marathi+hindi+ssc+eng+maths);
		int totalmarks=500;
		
		int percentage= (totalobtmarks*100)/totalmarks;
		
		System.out.println("total obtain marks:"+totalobtmarks);
		System.out.println("total  marks:"+totalmarks);
         System.out.println("percentage:"+percentage);
         
         
         switch(percentage/10)
         {
         case 9 : System.out.println("grade A");
         break;
         case 8 : System.out.println("grade B");
         break;
         case 7 : System.out.println("grade C");
         break;
         case 6 : System.out.println("grade D");
         break;
         case 5 : System.out.println("grade E");
         break;
         case 4 : System.out.println("grade F");
         break;
         default:System.out.println("fail");
         
         }
	}

}
