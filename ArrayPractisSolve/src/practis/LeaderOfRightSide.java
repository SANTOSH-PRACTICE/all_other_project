package practis;

public class LeaderOfRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,5,23,34,30,20,15};

        for (int i = 0; i < a.length; i++) {
            int count=0;

        	for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j])
				{
					count++;
					break;
					
				}
			}
        	if(count==0) {
			System.out.println(a[i]);
		}
	}}

}
