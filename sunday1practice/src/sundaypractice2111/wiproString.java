package sundaypractice2111;

public class wiproString {

	public static void main(String[] args) {
    
		String s="san sat ram fri go no go no";
		String a[]=s.split(" ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		String s1="";
		String []aa=new String[a.length];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					s1=s1+a[i];
					aa[index++]=a[i];
				}
			}
		}
//		for (int i = 0; i < aa.length; i++) {
//			System.out.println(aa[i]);
//		}
		System.out.print(s1);
	}

}
