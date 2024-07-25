package practis;

public class charno29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=11;i++)
		{
			int count=0;
			for(int j=0;j<6;j++)
			{
				if(j+i<=5 ||(j-i<= -6))
			{
				System.out.print((char) (count+65));	
					
		  }
				else
				{
					System.out.print(" ");
				}
				count++;
				
			}
			System.out.println();
		}
		

	}

}
/*
ABCDEF
ABCDE 
ABCD  
ABC   
AB    
A     
A     
AB    
ABC   
ABCD  
ABCDE 
ABCDEF
*/