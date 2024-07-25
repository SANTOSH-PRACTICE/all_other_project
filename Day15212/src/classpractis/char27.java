package classpractis;

public class char27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int count=0;
			for(int i=0;i<9;i++)
			{      
				        for(int j=0;j<5;j++)
				        {
				        	if(j-i<=0 &&j+i<=8)
				        	{
				        		System.out.print((char)(count+65));
				        		
				        	}
				        	else
				        	{
				        		System.out.print(" ");
				        	}
				        	
				        }	
				        	
			     if(i<4)
			     {
			 count++;
		
			     }
		
		if(i>=4)
		{
			count--;
		}
		
System.out.println();

	}

}
}
/*
A    
BB   
CCC  
DDDD 
EEEEE
DDDD 
CCC  
BB   
A    
*/