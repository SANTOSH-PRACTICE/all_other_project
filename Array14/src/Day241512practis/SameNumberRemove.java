package Day241512practis;

public class SameNumberRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,7,3,5,9};
		
		int cnt=0;
		int num=3;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
			{
				cnt++;
			}
		}
		System.out.println("count: "+cnt);
		int index=0;
		
		int [] b=new int[a.length-cnt];
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==num)
			{
				
			}
			else
			{
			b[index++]=a[i]	;
			
			}}
		System.out.println("orignal array:");
			for (int i= 0; i < a.length; i++) {
				System.out.print(a[i]+" ");

			}
			System.out.println();
			System.out.println("modified array: ");

			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i]+" ");

		}
	
	}

}
