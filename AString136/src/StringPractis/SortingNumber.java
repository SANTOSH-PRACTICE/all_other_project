package StringPractis;

public class SortingNumber {

	public static void main(String[] args) {

		
		String s="5612789";
		String sa[]=s.split(" ");
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
		String s1=new String(ch);

		System.out.println(s1);
		
	}

}
