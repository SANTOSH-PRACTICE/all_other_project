package prelim21feb2021setA;

public class Que7 {

	public static void main(String[] args) {

		
		String s="43521";//12345
		char ch[]=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i]>ch[j])
				{
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
	}

}
