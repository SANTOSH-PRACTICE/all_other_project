package Day30231221practis;

import java.util.Scanner;

public class Booklet34yyt {
	
	int findMin(int m,int n,int []a)
	{
		int mi=0;
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==m)
			{
				mi=i;
				cnt++;
				System.out.println("1st element index: "+i);
				break;
			}
		}
		int ni=0;
		int cnt1=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==n)
			{
				ni=i;
				cnt++;
				System.out.println("2 nd element index: "+i);
				break;
			}
		}
		if(cnt==0)
		{
			System.out.println("1 st element not found");
		}
		if(cnt1==0)
		{
			System.out.println("2nd element not found");
		}
		int diff=mi-ni;
		
		return diff;
		
	}

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int a[]= {-3,5,4,2,6,5,3,6,6,5,4,8,3};

		System.out.println("Enter 1st Element: ");
		int m=sc.nextInt();
		
		System.out.println("Enter 2st Element: ");
		int n=sc.nextInt();
		Booklet34yyt s=new Booklet34yyt();
				{
			System.out.println("Diff : "+s.findMin(m,n,a));
				}
		
	}

}
