package Day3291221practis;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdddef";
		int max=0;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < s1.length(); i++) 
		{int count=0;
		for (int j = 0; j < i; j++)
		{
			if(s1.charAt(i)==s1.charAt(j))
			{
				count++;
			}
		}
		if(count==0)
		{int newcnt=0;
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
			if(max<newcnt)
			{
				max=newcnt;
			}
			if(min>newcnt)
			{
				min=newcnt;
			}
				
			
		}
		
			
		}
		System.out.println("minimwm no of element: "+min);
		System.out.println("maximwm no of element :"+max);

	}

}
