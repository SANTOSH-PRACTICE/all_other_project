package Day30231221practis;

public class Booklet34 {

	int mindist(int arr[],int n,int x,int y)
	{
		int mindist=Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) 
		{
			for (int j = i; j < n; j++) 
			{
				if((x==arr[i]&&y==arr[j]||(y==arr[i]&&x==arr[j])) 
					&&(mindist>Math.abs(i-j)))
					mindist=Math.abs(i-j);
			}
		}
		if(mindist>n)
		{
			return -1;
		}
		return mindist;
	}
	public static void main(String[] args) 
	{
		Booklet34 dist=new Booklet34();
		int arr[]= {-3,5,4,2,6,5,3,6,6,5,4,8,3};
		int n=arr.length;
		int x=-3;
		int y=3;
		System.out.println("mindist: "+  x +"and: "+ y +"is: "+dist.mindist(arr,n,x,y));
	}
}
