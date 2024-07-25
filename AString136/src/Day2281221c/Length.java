package Day2281221c;

import java.io.IOException;
import java.io.StringReader;

public class Length {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="welcome";
		int i=0;
		StringReader sr=new StringReader(s);
		int length=0;
		while((i=sr.read())!=-1)
		{
			System.out.println((char)i);
			length++;
		}
		System.out.println(length);

	}

}
