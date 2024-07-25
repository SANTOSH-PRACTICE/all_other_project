package basicloop;

public class HarshadNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		int orignalNum=num;
		
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		if(orignalNum%sum==0)
		{
			System.out.println("harshad num");
		}
		else
		{
			System.out.println("not");
		}

	}

}
