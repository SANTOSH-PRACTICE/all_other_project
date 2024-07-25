package practis;

public class REverseArrayTHIRD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= { 1,2,3,4,5,6,7};
		int start=0;
		int end=a.length-1;
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			end--;
			start++;
		}
		for (int i = 0; i < a.length; i++) {
			
		
System.out.print(" " +a[i]);
	}}

}
