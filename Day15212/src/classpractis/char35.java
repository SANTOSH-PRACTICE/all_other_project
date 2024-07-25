package classpractis;

public class char35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=0;
		for(int i=0;i<6;i++)
		{
		
		
			for(int j=0;j<6;j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(count1++ +65));
					
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
A     
BC    
DEF   
GHIJ  
KLMNO 
PQRSTU
*/
/*
public static void main(String[] args) {
	

int count1=1;
for(int i=0;i<6;i++)
{


	for(int j=0;j<6;j++)
	{
		if(j-i<=0)
		{
			System.out.print(count1++  );
			
      	}
		else
		{
			System.out.print(" ");
		}

}

	
	System.out.println();
	
	
}}}

/*
1     
23    
456   
78910  
1112131415 
161718192021
*/