package practis;

public class PairInarray {

	public static void main(String[] args) {
     int a[]= {1,2,3,4,4,3,5,6};
     
     int ele=6;
     for (int i = 0; i < a.length; i++)
     {
		for (int j = i+1; j < a.length; j++)
		{
			if(a[i]+a[j]==ele)
			{
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}
    		 
     
	}

}
