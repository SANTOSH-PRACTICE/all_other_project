package basicloop;

public class KaprekarNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=45;
		int sq=num*num;
		int den=0;
		int digit=0;
		int dublicateNum=num;
		while(dublicateNum>0)
		{
			dublicateNum=dublicateNum/10;
			digit++;
			
		}
		den=(int) Math.pow(10, digit);
		
		int part1=sq/den;
		int part2=sq%den;
		int sum=part1+part2;
		if(num==sum&&num>0)
		{
			System.out.println("kaperkr number:");
		}
		else
		{
			System.out.println("not");
		}
			

	}

}
