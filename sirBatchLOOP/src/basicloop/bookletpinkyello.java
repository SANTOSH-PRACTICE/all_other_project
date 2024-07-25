package basicloop;

public class bookletpinkyello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//booklet 6
		for (int i = 33; i <=999; i++) 
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println("PINK &YELLOW");
			}
			else if(i%3==0)
			{
				System.out.println("Pink");
			}
			else if(i%5==0)
			{
				System.out.println("YELLOW");
			}
			else
			{
				System.out.println(i);
			}
		}

	}

}
