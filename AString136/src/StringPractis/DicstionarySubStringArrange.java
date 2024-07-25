package StringPractis;

public class DicstionarySubStringArrange {

	public static void main(String[] args) {

		
		String s="santosh is my name ab cd";
		String[] sa=s.split(" ");
		
		for (int i = 0; i < sa.length; i++)
		{
			for (int j = i+1; j < sa.length; j++)
			{
				if(sa[i].charAt(0)>sa[j].charAt(0))
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
				
			}
			
			
		}
		for (int i = 0; i < sa.length; i++)
		{
			System.out.print(sa[i]+" ");
		}
	}

}
