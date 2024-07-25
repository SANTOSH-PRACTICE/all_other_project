package StringPractis;

public class StringSorting {

	public static void main(String[] args) {
		
		
		for (int i = 0; i <7; i++) 
		{
			for (int j = 1; j <14; j=j+2) {
				if(j+i>=7&&j-i<=7)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//		// TODO Auto-generated method stub
//		String s="hellosantoshhello";
//		char[] ch=s.toCharArray();
//		for (int i = 0; i < ch.length; i++)
//		{
//			for (int j = i+1; j < ch.length; j++) 
//			{
//				if(ch[i]>ch[j])
//				{
//					char temp=ch[i];
//					ch[i]=ch[j];
//					ch[j]=temp;
//					
//				}
//			}
//			
//		}
//		for (int i = 0; i < ch.length; i++)
//		{
//			System.out.print(ch[i]);
//		}
		
		

	}

}
