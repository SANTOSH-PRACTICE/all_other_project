package day6class;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
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
		
		
		int obtmarks =eng+maths+hindi+ssc+sci;
		int totalmarks =500;
		int percentage=((obtmarks*100)/totalmarks);
		System.out.println("obtained marks="  +obtmarks);
		System.out.println("total marks="  +totalmarks);
		
		System.out.println("percentage:" +percentage);

		
          if((percentage>=90)&&(percentage<=100))
          {
        	  System.out.println("Grade A");
          }
          
          
          else if((percentage>=80)&&(percentage<90))
          {
        	  System.out.println("Grade B");
          }
          
          
          else   if((percentage>=70)&&(percentage<80))
          {
        	  System.out.println("Grade C");
          }
          
          
          else if((percentage>=60)&&(percentage<70))
          {
        	  System.out.println("Grade D");
          }
          
          
          else if((percentage>=50)&&(percentage<60))
          {
        	  System.out.println("Grade E");
        	  
        	  
          }
          
          else if((percentage>=40)&&(percentage<50))
          {
        	  System.out.println("Grade F");
          }
          
          
          else
          {
        	  System.out.println("fail");
        	  
          }
		
		
		
		
		

	}

}
