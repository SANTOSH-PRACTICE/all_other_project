package practis;

public class Returnmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
		
			for (int i = 0; i < 2; i++) {
				
				int temp=a[0];

			for (int j = 0; j < a.length-1; j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
			}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}

	}

}
