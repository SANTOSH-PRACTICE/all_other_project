package number;

public class nump5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=1;
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 5; j++) 
			{
				if(j+i<=4||j-i<=-4)
				{
					
					System.out.print(cnt);
				}
				else
				System.out.print(" ");
			}
			if(i<=3)
				cnt++;
			
			else if(i==3)
				cnt--;
			else
				cnt--;
			System.out.println();
		}

	}

}
