package Day241512practis;

public class Indexdiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {54,23,45,56,34,12};
		int min=Integer.MAX_VALUE;
		int indexMin=0;
		
		for (int i = 0; i < a.length; i++)
		{
			if(min>a[i])
			{
				indexMin=i;
				min=a[i];
			}
		}
		System.out.println(min);
		System.out.println(indexMin);
		int max=Integer.MIN_VALUE;
		int indexmax=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(max<a[i])
			{
				max=a[i];
				indexmax=i;
			}
		}
		
		System.out.println(max);
		System.out.println(indexmax);
		
		System.out.println("diffrance index: "+(indexmax-indexMin));
		System.out.println("diffrance: "+(max-min));
	}

}
