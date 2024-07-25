package Day2281221practis;

public class CharactorPresentInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="santosh";
		char ch='y';
		boolean flag=false;
		for (int i = 0; i<s.length(); i++) 
		{
			if(s.charAt(i)==ch)
			{
				flag=true;
				break;
							
			}
		}
		if(flag==true)
		{
			System.out.println("charactor present ");
		}
		else
		{
			System.out.println("charactor is not present");
		}

	}

}
