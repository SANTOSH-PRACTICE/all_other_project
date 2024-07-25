package Day241512practis;

public class EqualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5,6};
		int[] b= {1,2,3,4,5};
		if(a.length==b.length)
{ 
			int cnt=0;
		
		for (int i = 0; i < b.length; i++) 
	 {
			
			if(a[i]!=b[i])
			  {
				cnt++;
				
				System.out.println("two Arrays are not Same");
				break;
			  }
			
	 }
			if(cnt==0) 	 
		    System.out.println("two arrays are same");
			}

			 else 
			 	System.out.println("two arrays are not same");
	   }
	
    }

