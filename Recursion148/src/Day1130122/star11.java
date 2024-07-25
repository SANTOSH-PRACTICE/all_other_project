package Day1130122;

public class star11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopI(0);
	}

	private static void loopI(int i) {
		if(i<9)
		{
			loopj(i,0);
			
			System.out.println();
			i++;
			loopI(i);
		}
		
	}

	private static void loopj(int i, int j) {
		if(j<5)
		{
			if(j+i<=4||j-i<=-4)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			loopj(i, j);
		}
		
	}

}
