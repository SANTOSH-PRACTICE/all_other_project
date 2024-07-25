package Day2281221c;

public class SortingOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="helloworld";
		char a[]=s.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		for(char x:a)
		{
			System.out.print(" "+x);
		}
	}

}
