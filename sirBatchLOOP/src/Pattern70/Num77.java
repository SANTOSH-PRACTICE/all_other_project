package Pattern70;

public class Num77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		for (int i = 0; i < 5; i++) 
		{
			int num2=num;
			int diff=4;
			for (int j = 0; j < 5; j++)
			{
				if(j-i<=0)
				{
					System.out.print(num2+" ");
					num2=num2+diff;
					diff--;
				}
			}
			System.out.println();
			num++;
		}

	}

}
