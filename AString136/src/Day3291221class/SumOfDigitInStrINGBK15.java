package Day3291221class;

public class SumOfDigitInStrINGBK15 {
	static int sum()
	{
		String s1="123abc";//change valve and check o/p
		int sum=0;
		for (int i = 0; i < s1.length(); i++)
		{
			int x='0';
			if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
			{
				sum=sum+(s1.charAt(i)-x);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(sum()!=0)
		{
			System.out.println("sum pf digit :"+sum());
		}
		else
		{
			System.out.println("zero");
		}
	}
}
