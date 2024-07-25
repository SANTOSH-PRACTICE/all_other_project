package practis;

import java.util.Scanner;

public class perpractif {

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
		
       if (percentage>=90 && percentage<=100)
       {
    	   System.out.println("grade A");
       }
       
       else  if (percentage>=80 && percentage<90)
       {
    	   System.out.println("grade B");
       }
       
       
       else if (percentage>=70 && percentage<80)
       {
    	   System.out.println("grade C");
       }
       
       else if (percentage>=60 && percentage<70)
       {
    	   System.out.println("grade D");
       }
       
       else  if (percentage>=50 && percentage<60)
       {
    	   System.out.println("grade E");
       }
       
       else if (percentage>=40 && percentage<50)
       {
    	   System.out.println("grade F");
       }
       
       else
       {
    	   System.out.println("fail");
       }
	}

}
