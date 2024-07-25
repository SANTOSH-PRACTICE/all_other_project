package StringPractis;

public class SumOfDigit 
{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="123assdd";
		int sum=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			int x='0';
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
			  sum=sum+(s.charAt(i)-x);	
			}
		}
		System.out.println("sum of digit: "+sum);

	}

}
