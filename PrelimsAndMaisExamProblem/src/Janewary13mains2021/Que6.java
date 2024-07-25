package Janewary13mains2021;

public class Que6 {

	public static void main(String[] args) {

		String s= "1abc23" ;                       //"abc12pqr";
		String s1="";
		
		for (int i = 0; i <s.length(); i++)
		{char ch=s.charAt(i);
			
		if(ch>=48&&ch<=57)
		{
			s1=s1+ch;
		}
		}
		System.out.println(s1+" ");

		char[] ch2=s1.toCharArray();
		int sum=0;
		for (int i = 0; i < ch2.length; i++)
		{ int a=(ch2[i]-48);
				sum=sum+(a*a);
		}
		System.out.println(sum);
		
	}

}
