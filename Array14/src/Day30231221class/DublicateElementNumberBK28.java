package Day30231221class;

public class DublicateElementNumberBK28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  //booklet 28
		int a[]= {1,1,1,1,1,2,2,3,4};
		int temp[]=null;

		int b[]= {1,2,4};

		for (int i = 0; i < b.length; i++)
		{
			int cnt=0;
			for (int j = 0; j < a.length; j++)
			{
				if(b[i]==a[j])
				cnt++;
				if(cnt==2)
				break;
			}
			int index=0;
			int count=0;
			 temp=new int[a.length-cnt];
			for (int j = 0; j < a.length; j++) {
				if(b[i]!=a[j]||count>1)
				{
					temp[index++]=a[j];
				}
				else
				{
					count++;
				}
			}
			a=temp;
		}
		for(int x:temp)
		{
			System.out.println(x);
		}
	}
}
