package Day282112class;

public class AdditionOf3paireINarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,7,6,5,1,2,3,4};
		int sum=12;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				for (int k = j+1; k < a.length; k++) 
				{
					if(a[i]+a[j]+a[k]==sum)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
					
				}
			}
		}

	}

}
