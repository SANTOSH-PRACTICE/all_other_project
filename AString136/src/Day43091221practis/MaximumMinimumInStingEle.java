package Day43091221practis;

public class MaximumMinimumInStingEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is santosh";
	     String[] sa=s.split(" ");
	     System.out.println("before************************ ");
	     for (int i = 0; i < sa.length; i++) {
			
		
	     System.out.print(sa[i]+" ");
	     }
	     for (int i = 0; i < sa.length; i++)
	     {
	    	
	    	 for (int j = i+1; j < sa.length; j++)
	    	 {
				if(sa[i].length()>sa[j].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
	     System.out.println();
	     System.out.println("after**************************");
	     
	     for (int i = 0; i < sa.length; i++) {
		    System.out.print(sa[i]+" ");
	     }
	     System.out.println();
	    
	     System.out.println("minimum: "+sa[0]);
	     System.out.println("maximum: "+sa[sa.length-1]);
	     
	}

}
