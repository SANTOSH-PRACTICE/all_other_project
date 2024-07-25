package classpractis;

public class no77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=1;
		for (int i=0 ;i<5;i++) //i+=2
		{
			 int count2=count1;
			 int diff=4;
			for(int j=0;j<9;j++)
			{
				if(j-i<=0)
				{
					System.out.print(count2);
				count2=count2+diff;
				//diff--;
				}
				else
					
				
					System.out.print(" ");
				
				diff--;
			}
			count1++;
			System.out.println();
		}


	}

}
/*
1        
26       
3710      
481113     
59121415    

*/