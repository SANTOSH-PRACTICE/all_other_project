package Day2281221practis;

public class RemoiveLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="santosh";
		char c[]=s.toCharArray();
		char elementRemove='o' ;
		char newarray[]=new char[s.length()-1];
		int index=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(elementRemove!=c[i])
			{
				newarray[index++]=c[i];
			}
		}
       for (char x:newarray)
       {
    	   System.out.print(x+" ");
       }

	}

}
