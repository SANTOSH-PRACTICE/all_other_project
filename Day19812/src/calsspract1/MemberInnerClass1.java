package calsspract1;

public class MemberInnerClass1 {
	int x=42;
	void m1()
	{
		System.out.println("hii from method m1...");
	}
	class sample
	{
		int num=78;
		String s ="san";
		     void display()
		     { m1();
		    	 System.out.println("hii from display..");
		    	 System.out.println("hii"+num+" "+x+" "+s);
		    	
		     }
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		MemberInnerClass1 s=new MemberInnerClass1();
		MemberInnerClass1.sample a=s.new sample();
		a.display();
	
	}

}
