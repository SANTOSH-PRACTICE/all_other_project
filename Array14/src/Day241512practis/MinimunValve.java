package Day241512practis;

public class MinimunValve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,3,4,5,8,2,9,11};
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
System.out.println("minmum valve: "+min);
	}

}
