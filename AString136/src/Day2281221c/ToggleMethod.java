package Day2281221c;

public class ToggleMethod {//change case lower to upper&up to lower

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="weLComE";
		char a[]=s.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>='A'&&a[i]<='Z')
        {
	      a[i]=(char) (a[i]+32);
        }
			else
			{
				a[i]=(char) (a[i]-32);
			}
		}
		for (char b:a)
		{
			System.out.print(b);
		}

		
	}

}
