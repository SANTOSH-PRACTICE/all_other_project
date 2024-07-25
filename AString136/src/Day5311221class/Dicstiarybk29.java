package Day5311221class;

public class Dicstiarybk29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="wlcome to tn hefshine abc well"; //capital letter will be first
		String sa[]=s.split(" ");
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
			System.out.println(sa[i]+" ");
		  }
	}

}
