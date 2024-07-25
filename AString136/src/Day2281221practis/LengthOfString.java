package Day2281221practis;

import java.io.IOException;
import java.io.StringReader;

public class LengthOfString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="santosh";
		int i=0;
		int length=0;
		StringReader sr=new StringReader(s);
		while((i=sr.read())!=-1)
	  {
			System.out.println((char)i);
			length++;
			
	 }
		System.out.println(length);
			
		
		

	

	
	}

}
