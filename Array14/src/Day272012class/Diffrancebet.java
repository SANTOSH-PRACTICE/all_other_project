package Day272012class;

public class Diffrancebet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,1,8,2,7,4,6,5,11,89};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)//we also take j=0 and length-1;
			{                                 //if(a[j]=a[j+1]
				if(a[i]>a[j])
				{                             //int temp=a[j];a[j]=a[j+1];a[j+1]=temp;
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		for(int x:a)
		{
			System.out.print(" "+x);
		}
System.out.println();

int max=a[a.length-1];
System.out.println("largest no is: "+max);

int min=a[0];
System.out.println("Smallest number is: "+min);
System.out.println("Diffrance between largest and samllest number is: "+(max-min));
	}

}
