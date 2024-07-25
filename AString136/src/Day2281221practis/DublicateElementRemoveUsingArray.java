package Day2281221practis;

public class DublicateElementRemoveUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sanntooshhhhhrrrraoo";
		char c[]=s.toCharArray();
		String s1="";
		
		for (int i = 0; i < c.length; i++)
		{
			int cnt=0;
			for (int j = i+1; j < c.length; j++)
			{
				if(c[i]==c[j])
				{
					cnt++;
					break;
					
				}}
				if(cnt==0)
				{
					s1=s1+c[i];
				}
			
			
		}
		System.out.println(s1);
		


	}

}
