package practis;

public class sampleno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int count1=5;	

  for(int i=0;i<6;i++)
  {
int count2=count1;
	  for(int j=0;j<6;j++)
	  {
		  if(j+i<=5)
		  {
			  System.out.print(count2);
		  }
		  else
		  {
			  System.out.print(" ");
		  }
		  count2--;
	  }
	  count1--;

	  System.out.println();
  }
	}
}

