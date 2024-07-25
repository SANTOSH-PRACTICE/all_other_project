package classr;

class Sample15
{
Sample15()

{
	System.out.println("Hii from Super1");
	
}
}
public class SuperUsing  extends Sample15
{
	SuperUsing()
	{
		super();
		System.out.println("Hii form Test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperUsing t=new  SuperUsing();
		
		

	}

}
