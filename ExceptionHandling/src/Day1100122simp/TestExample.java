package Day1100122simp;

public class TestExample {

	public static void main(String[] args) {
     int num1=50;
     int num2=0;
     int res=0;
     int a[]=new int[5];
     for (int i = 0; i < a.length; i++)
     {
		a[i]=i;
	}
     try {
     try
     {
    	 System.out.println(a[7]/0);
    	 
     }
     catch(ArrayIndexOutOfBoundsException e)

	{
    	 System.out.println("index");
    }
     res=num1/num2;
     
	}
	catch(NullPointerException ne)
	{
		System.out.println("Null");
	}
	catch(ArithmeticException ae)
     {
		System.out.println("Arithmetic Exception .....Infinite");
     }
     catch(Exception e)
     {
    	 System.out.println("Exception");
     }

}}
