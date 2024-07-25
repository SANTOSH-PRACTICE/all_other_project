package conructorclass;

public class Test2 {

	
		long num;
		Test2(long num)
		{
			this.num=num;
		}
		
		void oddEven()
		{
			factorial();
			if(num % 2 ==0)
			{
				System.out.println("number is even:"+num);
			}
			else
			{
				System.out.println("number is odd:"+num);
			}
			
			
		}
		void factorial()
		{
			sumOfDigit(num);
		
			long fact=1;
			do {
				 fact=num*fact;
				 num--;
			
				 }while(num>0);
			 System.out.println("factorial is:"+fact);
			
			
			
		}

		void sumOfDigit(long num2)
		{
			int rem=0,sum=0;
			
			while(num>0)
				{
			rem=(int)(num2%10);
				 sum=sum+rem;
				 num2=num2/10;
				 
				 
				}
			
			System.out.println("sum of digit:"+sum);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Test2 a=new Test2(12);
			a.oddEven();
		
			
		}


	}


