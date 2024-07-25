package classpractis;

public class starzigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=0;i<4;i++)
	      {	
	        for(int j=0;j<19;j++)
	        {
	        	if(( j+i==3) ||( j-i==3)||(j+i==9)||( j-i==9)||(j+i==15)||(j-i ==15))
	        	{
	        		System.out.print("*");
	        	}
	        	else
	        	{
	        		System.out.print(" ");
	        	}
	        }
	        	System.out.println();
	        }

	}

}
/*
   *     *     *   
  * *   * *   * *  
 *   * *   * *   * 
*     *     *     *
*/