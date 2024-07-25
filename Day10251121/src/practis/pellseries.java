package practis;

public class pellseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int currentnum=1;
	    int previusnum=0;
	    int nextnumber=0;
	    
	    System.out.print(previusnum+ "  "+currentnum);
	    for(int i=0;i<15;i++)
	    {
	    	nextnumber=previusnum +(2*currentnum);
	    	System.out.print(" " +nextnumber+" ");		
	    	previusnum=currentnum;
	    	currentnum=nextnumber;
	    	
	    }

	}

}
