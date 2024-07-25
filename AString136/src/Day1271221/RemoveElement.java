package Day1271221;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome";
		char c[]=s.toCharArray();
		int elementRemove='m';
		
		char newArray[]=new char[c.length-1];
		int index=0;
		for (int i = 0; i <c.length; i++)
		{
			if(elementRemove!=c[i])
			{
				newArray[index++]=c[i];
				
			}
			
		}
		for(char m:newArray)
		{
			System.out.print(" "+m);
		}
		

	}

}
