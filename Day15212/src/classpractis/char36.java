package classpractis;

public class char36 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
   int count=0;
		for(int i=0;i<6;i++)
		{
	int count2=count;
			for(int j=0;j<6;j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(count2+65));
					count2--;
					}
				else
				{
					System.out.print("  ");
				}
			}
		
			System.out.println();
			count++;
		}


	}

}


/*
/*
A          
BA        
CBA      
DCBA    
EDCBA  
FEDCBA
*/
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int count=1;
		for(int i=0;i<6;i++)
		{
	int count2=count;
			for(int j=0;j<6;j++)
			{
				if(j-i<=0)
				{
					System.out.print(count2);
					count2--;
					}
				else
				{
					System.out.print("  ");
				}
			}
		
			System.out.println();
			count++;
		}}}

/*
1          
21        
321      
4321    
54321  
654321
*/
