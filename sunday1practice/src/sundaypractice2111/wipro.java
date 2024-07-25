package sundaypractice2111;

public class wipro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=10;
		int sum=0;
		for (int i = a; i < b; i++)
		{  int count=0;
			for (int j = 2; j < 10; j++) 
			{
				if((i*i)==j)
				{
					count++;
					break;
				}
				
			}
			if(count>0)
			{
				sum=sum+(i*i);
			}
		}
		System.out.println(sum);
		

}
}