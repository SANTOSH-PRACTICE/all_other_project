package Practis;

public class Number {

	public static void main(String[] args) {
           int count=1;
		for (int i = 0; i < 5; i++) 
		{
			
			int temp=count+i;
			for (int j = 0; j <5; j++) 
			{
				if(j+i>=4)
				{
					if(i%2==0)
					{
						System.out.print(count+++" ");
						
					}
					else
					{
						System.out.print(temp--+" ");
						count++;
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
