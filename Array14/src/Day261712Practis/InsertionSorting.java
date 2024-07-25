package Day261712Practis;

public class InsertionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {3,4,2,8,6,4,9,3,58,8};
      for (int i = 0; i < a.length; i++) {
    	  
    	  int j=i;
    	  int temp=a[i];
    	  for (; j >0; j--) {
    		  if(a[j-1]>temp)
    		  {
    			 a[j]=a[j-1];
    		  }
    		  else 
    			  break;
			
		}
    	  
      a[j]=temp;
      }
		for (int i = 0; i < a.length; i++) {
			
		System.out.print(" "+a[i]);
	}

	}

}
