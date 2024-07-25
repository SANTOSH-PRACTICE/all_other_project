package Day30231221practis;

public class PairElementInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,3};
		int b[]=new int[a.length];
		int index=0;
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i]!=a[i+1])
			{
				b[index++]=a[i];
			}
		}
		
		b[index++]=a[a.length-1];
		
			
		for (int i = 0; i < b.length-1; i++)
		{
			System.out.println(b[i]);
		}
		for (int i = 0; i < index; i++) 
		{
			for (int j = 0; j < index; j++) 
			{
				System.out.println(b[i]+" "+b[j]);
			}
		}
		}
}
