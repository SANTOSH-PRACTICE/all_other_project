package Janewary13mains2021;

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,2,1,4,3,2,5,6,7,8,7,9,2,0};
		int b[]=new int[a.length];
		
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			int cnt=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
				
			}
			if(cnt==0)
			{
				b[index++]=a[i];
			}
		}
		for (int i = 0; i < index; i++)
		{
			System.out.print(b[i]+" ");
		}
		
		

	}

}
