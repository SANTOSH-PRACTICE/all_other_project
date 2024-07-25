package Day3291221practis;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abbbbc";
		
		for (int i = 0; i < s1.length(); i++)
		{
			int count=0;
			for (int j = 0; j < i; j++) 
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			{
				int newcnt=0;
				for (int j = 0; j < s1.length(); j++) 
				{
					if(s1.charAt(i)==s1.charAt(j))
					{
						newcnt++;
					}
				}
				if(newcnt>0)
				{
					System.out.println(s1.charAt(i)+" "+newcnt);
				}
			}
			
		}

	}

}
