package conructorclass;

public class Test {
	int number;
	
	Test(int number)
	{
		this.number=number;
	}
	
	void oddEven()
	{
		factorial();
		if(number % 2 ==0)
		{
			System.out.println("number is even:"+number);
		}
		else
		{
			System.out.println("number is odd:"+number);
		}
		
	}
	void factorial()
	{
		sumOfDigit();
		int num=number;
		int fact=1;
		do {
			 fact=num*fact;
			 num--;
		
			 }while(num>0);
		 System.out.println("factorial is:"+fact);
		
		
		
	}

	void sumOfDigit()
	{
		int sum=0;
		int num=number;
		while(num>0)
			{
			int rem=num%10;
			 sum=sum+rem;
			 num=num/10;
			 
			 
			}
		
		System.out.println("sum of digit:"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test a=new Test(12);
		a.oddEven();

	}

}
