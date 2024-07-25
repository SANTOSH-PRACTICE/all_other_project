package Day292212Class;

public class MaximumInCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= { {99,2,3},
				{4,5,6},
				{7,8,9}
		};
		for (int i = 0; i < 3; i++) {
			int max=a[0][i];
			for (int j = 0; j < 3; j++) {
				if(a[j][i]>max)
				{
					max=a[j][i];
				}
				
			}
			System.out.print(" "+max);
			
		}

	}

}
