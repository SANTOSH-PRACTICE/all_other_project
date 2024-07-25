package StringPractis;

public class MaximumMinimumSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="santosh is my name";
		String ch[]=s.split(" ");
		
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i; j < ch.length; j++)
			{
				if(ch[i].length()>ch[j].length())
				{
					String temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
			
		     }
		}
		for (int i = 0; i < ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		String min=ch[0];
		System.out.println(min);
		
		String max=ch[ch.length-1];
		
		System.out.println(max);
	}

}
