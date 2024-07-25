package Day4301221c;

public class MaxMinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to HefShine";
		String [] sa=s.split(" ");
		for (int i = 0; i < sa.length; i++)
		{
			for (int j = i+1; j < sa.length; j++) 
			{
				if(sa[i].length()>sa[j].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		System.out.println("min: "+sa[0]);
		System.out.println("max : "+sa[sa.length-1]);

	}

}
