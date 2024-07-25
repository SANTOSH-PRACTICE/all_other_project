package sunday2practis;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i>=4 && j-i>=-4)
				{
					System.out.print((char) (i+65)+" ");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}




	}

}
/*
    A 
   B B 
  C C C 
 D D D D 
E E E E E 
 F F F F 
  G G G 
   H H 
    I 
    */

