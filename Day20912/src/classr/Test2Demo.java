package classr;

class Test11
{
	int num1,num2;
}
class Test12 extends Test11
{
	int num3;
}

public class Test2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test12 t2=new Test12();
		t2.num1=12;
		t2.num2=10;
		t2.num3=13;
		System.out.println(t2.num1+" "+t2.num3+" "+t2.num3);
		

	}

}
