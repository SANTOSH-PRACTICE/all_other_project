package day241412;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {7,6,1,2,3,4,5,9};
		int evencnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
				evencnt++;
		}
		System.out.println("evencnt:"+evencnt);
		int oddcnt=a.length-evencnt;
		System.out.println("odd cnt: "+oddcnt);
		int[]evenArr=new int[evencnt];
		int[] oddArr=new int[oddcnt];
		int evenIndex=0;
		int oddIndex=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
				evenArr[evenIndex++]=a[i];
			else
				oddArr[oddIndex++]=a[i];
		}
           System.out.println("odd array");
           for (int i = 0; i < oddArr.length; i++)
           {
			System.out.print(oddArr[i]+" ");
		   }
           System.out.println();
           System.out.println("even array:");
           for (int i = 0; i < evenArr.length; i++)
           {
			System.out.print(evenArr[i]+" ");
           }
     }
    }
