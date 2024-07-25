package Day30231221practis;

public class splitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {15,1,3,6,8,2,9,0,10};
		int incrimentarray[]=new int[a.length];
		int decrimentArray[]=new int[a.length];
		
		if(a[0]>a[1])
		{
			incrimentarray[0]=a[1];
			decrimentArray[0]=a[0];
		}
		else
		{
			incrimentarray[0]=a[0];
			decrimentArray[0]=a[1];
			
		}
		int index1=1;
		int index2=1;
		int incEle=incrimentarray[0];
		int decEle=decrimentArray[0];
for (int i = 2; i < a.length; i++) 
{  if(a[i]>incEle)
	
  {incrimentarray[index1++]=a[i];
    incEle=a[i];
	
}
	
		
		

}	}

}
