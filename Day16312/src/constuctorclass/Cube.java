package constuctorclass;

import java.util.Scanner;

public class Cube {
	
	int height,width,length;

	  void calculateVolume(int height,int width,int length)
	  {
		 int calculateVolume =height*width*length;
		 System.out.println("volume:"+calculateVolume);

	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height:");
		int height=sc.nextInt();
		
		System.out.println("Enter length:");
		int length=sc.nextInt();
		
		System.out.println("Enter width:");
		int width=sc.nextInt();
		
		Cube a=new Cube();
		a.calculateVolume(height, width, length);



	}

}
