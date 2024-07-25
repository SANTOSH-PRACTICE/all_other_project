package Day2281221practis;

public class SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="santoshhonrao";
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++)
		{
			for (int j = i+1; j < c.length; j++) 
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
				
			}
			
		}
		for(char x:c)
		{
			System.out.print(x+" ");
		}

	}

}
