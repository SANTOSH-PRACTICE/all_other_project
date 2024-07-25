package test;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int    n=25;
      int cnt=0;
      for (int i = 2; i < 25; i++) 
      {
		if(n%i==0)
		{
			
		}
		else
		{
			cnt++;
		}
	}
      if(cnt==0)
      {
    	  System.out.println("prim");
      }
      else
      {
    	  System.out.println("not");
      }
      
   }
}
