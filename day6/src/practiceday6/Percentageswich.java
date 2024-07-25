package practiceday6;

import java.util.Scanner;

public class Percentageswich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int eng,maths,ssc,hindi,sci;
		System.out.println("Enter marks of english (out off 100):");
		eng =sc.nextInt();
		
		System.out.println("Enter marks of maths (out off 100) :");
		maths =sc.nextInt();
		
		System.out.println("Enter marks of social science (out off 100):");
		ssc=sc.nextInt();
		
		System.out.println("Enter marks of science (out off 100):");
		sci =sc.nextInt();
		
		System.out.println("Enter marks of hindi :");
		hindi =sc.nextInt();
		
		
		int obtmarks =eng+maths+hindi+ssc+sci;
		int totalmarks =500;
		int percentage=((obtmarks*100)/totalmarks);
		System.out.println("obtained marks="  +obtmarks);
		System.out.println("total marks="  +totalmarks);
		
		System.out.println("percentage:" +percentage);
		
		
		switch(percentage/10)
		{
		case 9:  System.out.println("Grade A");
	          	break;
	          	
		case 8:  System.out.println("Grade B");
      	break;

      	
      	
		case 7:  System.out.println("Grade C");
      	break;

		case 6:  System.out.println("Grade D");
      	break;

		case 5:  System.out.println("Grade E");
      	break;
		case 4:  System.out.println("Grade F");
      	break;
      	
      	default:System.out.println("fail");


      	
   
		
		
		
		
		
		
		
		}

		
		

	}

}
