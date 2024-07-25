package day241412;

public class Countmaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
		
int num=3;
int cnt=0;
for(int i=0;i<a.length;i++)
{
	if(num==a[i])
	{
		cnt++;
	}
}
if(cnt==0)
{
	System.out.println("not found");
}
else
{
	System.out.println("found: "+cnt);
}
	}

}
