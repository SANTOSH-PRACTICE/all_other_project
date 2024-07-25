package StringPractis;

public class onlyDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123455a";
		char a[]=s.toCharArray();
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>=48&&a[i]<=57)
			{
				
			}
			else
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("All element is digit");
		}
		else
		{
			System.out.println("all element is not digit");
		}

	}

}
