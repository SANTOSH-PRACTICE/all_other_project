package practis;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc =new Scanner(System.in);
  int marathi,maths,sci,ssc,hindi;
  System.out.println("enter marks in marathi(100 max ):");
  marathi=sc.nextInt();
  System.out.println("enter marks in maths(100 max ):");
  maths=sc.nextInt();
  System.out.println("enter marks in sci(100 max ):");
  sci=sc.nextInt();
  System.out.println("enter marks in ssc(100 max ):");
  ssc=sc.nextInt();
  System.out.println("enter marks in hindi(100 max ):");
  hindi=sc.nextInt();
  
  int totalmarks=( marathi+maths+sci+ssc+hindi);

  System.out.println("total marks:"+totalmarks);
  int percentage=((totalmarks*100)/500);
  System.out.println("percentage"+percentage);
  
  switch(percentage/10)
  {
  case 9 :System.out.println("grade A");
            break;
  case 8 :System.out.println("grade B");
  break;

  
  case 7 :System.out.println("grade C");
  break;

  
  case 6 :System.out.println("grade D");
  break;

  
  case 5 :System.out.println("grade E");
  break;

  
  case 4 :System.out.println("gradeF");
  break;

  default:System.out.println("fail");
  
  }
  
  
	}

}
