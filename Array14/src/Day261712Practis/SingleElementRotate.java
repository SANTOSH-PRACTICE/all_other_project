package Day261712Practis;

public class SingleElementRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,3,4,5,6,7};
		int temp =a1[0];
		for (int i = 0; i < a1.length-1; i++)
		{
			a1[i]=a1[i+1];
			
		}
       a1[a1.length-1]=temp;
       for (int i = 0; i < a1.length; i++) {
		System.out.print(" "+a1[i]);
	}
	}

}
