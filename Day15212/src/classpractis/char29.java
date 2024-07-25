package classpractis;

public class char29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<12;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(j+i<=5 ||j-i<=-6)
				{
					System.out.print((char)(j+65));
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