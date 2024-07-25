package Day2281221practis;

public class ToggleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sanTOsHhOnRAo";
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>='A'&&c[i]<='Z')
			{
				c[i]=(char) (c[i]+32);
				
			}
			else
			{
				c[i]=(char) (c[i]-32);

			}
			
		}
		for(char x:c)
		{
			System.out.print(x+" ");
		}

	}

}
