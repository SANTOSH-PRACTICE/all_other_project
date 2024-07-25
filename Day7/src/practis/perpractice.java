package practis;

import java.util.Scanner;

public class perpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
		
		int eng,maths,ssc,hindi,sci;
		System.out.println("Enter marks of english:");
		eng =sc.nextInt();
		
		System.out.println("Enter marks of maths:");
		maths =sc.nextInt();
		
		System.out.println("Enter marks of social science:");
		ssc=sc.nextInt();
		
		System.out.println("Enter marks of science:");
		sci =sc.nextInt();
		
		System.out.println("Enter marks of hindi:");
		hindi =sc.nextInt();
		
		
		int totalobtmarks=eng+ssc+maths+hindi+sci;
		int totalmarks=500;
		
		int percentage=(totalobtmarks*100)/totalmarks;
		
		System.out.println("total obtain marks:"+totalobtmarks);
		System.out.println("total marks:"+ totalmarks);
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
		
		
System.out.println("good luck for future");

	}

}
