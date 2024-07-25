package classpractis;

public class pellseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int currentTerm =1;
		int previusTerm =0;
	int 	nextTerm = 0;
	System.out.print(previusTerm+ "  "+currentTerm);
	for (int i=0;i<=15;i++)
	{
		nextTerm =previusTerm+ (2*currentTerm);
		System.out.print(" "+nextTerm+" ");
		
		previusTerm=currentTerm;
		currentTerm=nextTerm;
	}
		

	}

}
