package practis;

public class char30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=5;
		for(int i=0;i<12;i++)
		{
			int count2=count1;
			for(int j=0;j<6;j++)
			{
				if(j+i<=5 ||(j-i<= -6))
			{
					
					
				System.out.print((char) (count2+65));
				count2--;
				
				
					}
				
				else
				{
					System.out.print(" ");
				}
			}
				if(i<=5)
					count1--;
				
		
				if(i>=5)
				count1++;
				
		
			System.out.println();
		}
	
	}
}
	

/*
 FEDCBA
EDCBA 
DCBA  
CBA   
BA    
A     
A     
BA    
CBA   
DCBA  
EDCBA 
FEDCBA

 */

