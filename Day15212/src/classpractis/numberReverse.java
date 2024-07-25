package classpractis;

public class numberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int cnt=1;
		for(int i=0;i<5;i++)
	      {	
			int temp=cnt+i;
	        for(int j=0;j<5;j++)
	        {
	        	if(j+i>=4)
	        	{
	        		if(i%2==0)
	        		System.out.print(cnt++);
	        		else
	        		{
	        			System.out.print(temp--);
	        		cnt++;
	        		}
	        		
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
