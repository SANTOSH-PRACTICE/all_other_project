package day241412;

public class EqualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,4,5};  //change array element and 		  //size and check result	                          //int[]a= {1,2,3,4,5,6};	                         //int[]a= {1,2,3,5,4};
		int[]b= {1,2,3,4,5};
		if(a.length==b.length)
		{
			int cnt=0;
			for (int i = 0; i < b.length; i++) 
			{
				if(a[i]!=b[i])
				{
					cnt++;
					System.out.println("not same");
					break;
				}
			}
			if (cnt==0)
				System.out.println("same");
		}
		else
		
			System.out.println("not equal");
	}
}
