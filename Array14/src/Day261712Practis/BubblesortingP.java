package Day261712Practis;

public class BubblesortingP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {3,4,2,8,6,4,9,3,58,8};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
					
		}
for (int i = 0; i < a.length; i++) {
	System.out.print(" "+a[i]);
}
	}

}
