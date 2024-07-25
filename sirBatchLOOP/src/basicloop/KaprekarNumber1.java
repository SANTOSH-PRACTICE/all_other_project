package basicloop;

public class KaprekarNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=45;
		int sq=num*num;
		int den=0;
		if(num<10)
			den=10;
		else if(num<100)
			den=100;
		else if(num<1000)
			den=1000;
		else 
			den=10000;
		int part1=sq/den;
		int part2=sq%den;
		int sum=part1+part2;
		if(num==sum)
		{
			System.out.println("kaprekar number");
		}
		else
		{
			System.out.println("not");
		}
			
		

	}

}
