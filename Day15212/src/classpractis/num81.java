package classpractis;

public class num81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<5;i++)
			
			{		

			for(int j=0;j<10;j++)
			{
				if(j-i<=0 ||j+i>=9)
				{	if(j<5)
					System.out.print(j+1);
				else
				{
					System.out.print(10-j);
				}
					
				}
				else
				{
					System.out.print( " ");
				}
			}
		
			
			System.out.println();
	}
		

	}

}
/*
1        1
12      21
123    321
1234  4321
1234554321
*/