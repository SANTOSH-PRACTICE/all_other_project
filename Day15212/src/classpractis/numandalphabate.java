package classpractis;

public class numandalphabate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=0;i<5;i++)
	      {	
	        for(int j=0;j<10;j++)
	        {
          if(j+i>=4&& j-i<=5)	        	
            {
        	  
	        	if(j<=4)
	        		System.out.print(i+1);
	        	else
	        		System.out.print((char)(i+65));
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
    1A    
   22BB   
  333CCC  
 4444DDDD 
55555EEEEE

*/