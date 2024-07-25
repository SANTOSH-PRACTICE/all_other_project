package classpractis;

public class starheartshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=0;i<6;i++)
	      {	
	        for(int j=0;j<7;j++)
	        {
	        	if((j+i==1)||(j-i==-2)||(j+i==8)||(j-i==5)||((j+i==4)&&(i<=1))||((j-i==2)&&(i<=1)))
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

 ** ** 
*  *  *
*     *
 *   * 
  * *  
   *   
*/