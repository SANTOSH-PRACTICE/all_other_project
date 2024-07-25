package classpractis;

public class num82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;

		for(int i=0;i<5;i++)
			{for(int j=0;j<10;j++)
			{
				if(j-i<=0 ||j+i>=8)
					System.out.print(count);
				else
					System.out.print(" ");
			}
			count++;
			System.out.println();
	}
		

}
}
/*
1       11
22     222
333   3333
4444 44444
5555555555
*/