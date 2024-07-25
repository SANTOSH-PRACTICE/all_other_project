package Day2281221practis;

public class OnlyDigitStringcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123456";
		int count=0;
		char c[]=s.toCharArray();
		for (int i = 0; i < s.length(); i++) 
		{
			
			if(c[i]>=48&&c[i]<=57)
			{
				count++;
				
			}
			
		}

		if(count==c.length)
		{
			System.out.println("only digit");
		}
		else
		{
			System.out.println("not only digit");
		}
	}

}
