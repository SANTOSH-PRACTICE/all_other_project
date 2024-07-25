package Day2281221c;

public class charPresentinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome";
		char ch ='u';
		boolean flag =false;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==ch)
			{
				flag=true;
				break;
				
			}
		}
		
		if(flag==true)
		{
			System.out.println("Char "+ch+" is Present");
		}
		else
		{
			System.out.println("Not Present is the string");
		}

	}

}
