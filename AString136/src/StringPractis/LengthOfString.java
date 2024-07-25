package StringPractis;

import java.io.IOException;
import java.io.StringReader;

public class LengthOfString {

	public static void main(String[] args) throws IOException {

		String s="Santosh";
		int length=0;
         StringReader sr=new StringReader(s);
         
         int i=0;
		while((i=sr.read())!=-1)
         {
			System.out.println((char) i);
        	 length++;
        	 
         }
		System.out.println(length);
	

	
		
	}

}
