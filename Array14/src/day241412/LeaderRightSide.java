package day241412;

public class LeaderRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {5,10,10,7,8,99,96,7,93};
		
		for (int i = 0; i < a.length; i++) 
		{
			int cnt=0;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
				{
					cnt++;
					break;
				}
			}
			if (cnt==0)
				System.out.println(a[i]);
		}
	}
}
