package Day241512practis;

public class LeaderOfRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {4,7,4,3,9,2,7,4};
		System.out.println("leader numbers: ");

		for (int i = 0; i < a.length; i++) 
		{
			int cnt=0;
			
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j])
				{
					cnt++;
					break;
				}
				
			}
			if(cnt==0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
