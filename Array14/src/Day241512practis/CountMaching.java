package Day241512practis;

public class CountMaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,4,2,5,3,6};
		int num=7;// int num=3;
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(num==a[i])
			{
				cnt++;
			}
		}
		
		if(cnt==0)
		{
			System.out.println(" not maching");
		}
		else
		{
			System.out.println(" maching");
		}
   }
    }
