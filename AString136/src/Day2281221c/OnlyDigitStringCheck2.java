package Day2281221c;

public class OnlyDigitStringCheck2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123456";            //alphabate use and check o/p
		char c[]=s.toCharArray();
		int count=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>=48&&c[i]<=57)
			{
				count++;
			}
			
		}
		if(count==c.length)
		{
			System.out.println("All char are digit");
		}
		else
		{
			System.out.println("Not digit");
		}


	}

}
