package Day241512practis;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,4,6,7,8,9,4,2,6,7,4};
		int evencnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				evencnt++;
			}}
			System.out.println("even count: "+evencnt);
			int oddcnt=a.length-evencnt;
			System.out.println("odd count: "+oddcnt);
			
			int oddArr[]=new int[oddcnt];
			int evenArr[]=new int[evencnt];
			
			int evenIndex=0;
			int oddIndex=0;
			
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i]%2==0)
				{
					evenArr[evenIndex++]=a[i];
			
					
				}
				
				else
				{oddArr[oddIndex++]=a[i];
				
					
				}
			}
			
			System.out.println("for even index:");
			for (int i = 0; i < evenArr.length; i++) 
			{
				System.out.print(evenArr[i]+" ");
			}
			System.out.println();
			System.out.println("for odd index: ");
			for (int i = 0; i < oddArr.length; i++) 
			{
				System.out.print(oddArr[i]+" ");
			}
				
			
			
		
		

	}

}
