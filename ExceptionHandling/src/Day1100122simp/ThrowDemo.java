package Day1100122simp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Demo
{
	void fileWork()
	{
		
			try {
				FileInputStream file=new FileInputStream("Test.txt");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
	}
	
	static int division(int dividend,int diviser)throws  ArithmeticException
	{
		if(diviser==0)
		{
			throw new ArithmeticException("Divider cannot be zero");
			
		}
		else
		{
			return dividend/diviser;
		}
	}
	
}

public class ThrowDemo {

	public static void main(String[] args) 
	{
       int res=0;
       try
       {
    	   res=Demo.division(100, 0);
       }
       catch(ArithmeticException ae)
       {
    	   ae.printStackTrace();
    	   System.out.println("Arithmatic Exprestion is throw & handele");
    	   
       }
       finally
       {
    	   System.out.println("The result is :"+res);
       }
	}

}
