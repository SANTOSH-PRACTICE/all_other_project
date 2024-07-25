package Day261712Practis;

public class ArrayMersing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,4,5};
		int a2[]= {6,7,8,9,10,11};
		int a3[]=new int[a1.length+a2.length];
		int index=0;
		for (int i = 0; i < a1.length; i++) {
			a3[index++]=a1[i];
			
		}
		for (int i = 0; i < a2.length; i++) {
			a3[index++]=a2[i];
		}
		System.out.println("merged array: ");
		
      for (int x: a3) {
	

		System.out.print(" "+x);
	}
	}
}
