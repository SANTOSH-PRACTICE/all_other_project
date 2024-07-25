package Day272012class;

public class TwoEleSumFinding {

	public static void main(String[] args) {//boocklet num 36 pair of element
		// TODO Auto-generated method stub
		int a[]=  {1,2,3,4,5,6,7,8,9};//{2,4,3,5,6,-2,4,7,8,9};
		int num=7;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]+a[j]==num)
					
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}

	}

}
