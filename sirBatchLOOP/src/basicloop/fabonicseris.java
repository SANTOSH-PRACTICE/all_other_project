package basicloop;

public class fabonicseris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0);
		System.out.println(1);
		int a=0;int b=1;
		int count=0;
		while(count<13)
		{
			System.out.println(a+b);
			int c=a+b;
			a=b;
			b=c;
			count++;
		}

	}

}
