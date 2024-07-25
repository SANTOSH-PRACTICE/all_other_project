package day241412;

public class ArraySameElementRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,3,7,8};
		
		int num=3;int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
				cnt++;
			
		}
		System.out.println(cnt);
		int[] b=new int[a.length-cnt];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==num)
			{
				
			}
			else
			b[index++]=a[i]	;
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
		

	}

}
