package Day2281221c;

public class RemoveLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="Welcome";
       char elementToRrmoive='m'; 
       char a[]=s.toCharArray();
       char newArray[]=new char[a.length-1];
       int index=0;
       for (int i = 0; i < a.length; i++) 
       {
		if(elementToRrmoive!=a[i])
		{
			newArray[index++]=a[i];
		}
	}
       for(char x:newArray)
       {
    	   System.out.print(" "+x);
       }
	}

}
