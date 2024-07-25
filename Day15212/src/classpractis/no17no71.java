package classpractis;

public class no17no71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0 ;i<9;i=i+2) //i+=2
		{
			int count=1;
			for(int j=0;j<9;j++)
			{
				if(j-i<=0)
					
				{
					if(i>j*2)
						System.out.print(count++);
					else
					System.out.print(count--);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}}

/*
 * 
1        
121      
12321    
1234321  
123454321
*/
