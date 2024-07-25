package day241412;

public class IndexMINmaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {5,10,10,99,97,54,76};//check this element valve change
		int max=Integer.MIN_VALUE;
		int indexmax=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				max=a[i];
				indexmax=i;
			}
		}
		System.out.println("maximum valve of element:"+max);

		
		int min=Integer.MAX_VALUE;
		int indexmin=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]<min)
			{
				indexmin=i;
				min=a[i];
				
			}}
			System.out.println("minimum valve of element: "+min);
			int diff=max-min;
			System.out.println("diffrance elemert: "+diff);
			System.out.println(" index diffrance: "+(indexmax-indexmin));
			
		
	}
	

}
