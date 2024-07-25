package sunday2practis;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i>=4)
				{
					System.out.print((char) (j+65)+" ");
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
E 
D E 
C D E 
B C D E 
A B C D E 
*/