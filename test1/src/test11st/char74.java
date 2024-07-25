package test11st;

public class char74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=0;
		for(int i=0;i<5;i++)
		{int count2=count1;
			for(int j=0;j<9;j++)
			{
				if(j+i>=4 &&(j-i<=4))
					if(j<4)
						{
					System.out.print((char)(count2++ +65)+"");
						}
					else
				{
					System.out.print((char)(count2-- +65)+"");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			

		}
		
		count1++;
	}

}
