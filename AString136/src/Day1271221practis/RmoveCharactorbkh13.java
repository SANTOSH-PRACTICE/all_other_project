package Day1271221practis;

public class RmoveCharactorbkh13 {
	public static void main(String[] args) {
		
	
	String s="santosh";
	char c []=s.toCharArray();
	char removeEle='t';
	
	char newArray[]=new char[c.length-1];
	int index=0;
	for(int i=0;i<c.length;i++)
	{
		if(removeEle!=c[i])
		{
			newArray[index++]=c[i];
			
		}
	}
	for(char x:newArray)
	{
		System.out.print(x+" ");
	}
	
	
	

}
}