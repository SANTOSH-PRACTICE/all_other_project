package sunday2practis;

public class prim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int    n=3;
	      int cnt=0;
	      for (int i = 2; i <n; i++) 
	      {
			if(n%i==0)
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
