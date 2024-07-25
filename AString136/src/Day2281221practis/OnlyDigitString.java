package Day2281221practis;

public class OnlyDigitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123456r";
		char ch[]=s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>=48 && ch[i]<=57)
			{
				
			}
			else
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("string only digit");
		}

		else
		{
			System.out.println("String is not only digit");
		}
	}

}
