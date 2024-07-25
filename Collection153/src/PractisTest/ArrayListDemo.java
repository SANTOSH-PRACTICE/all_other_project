package PractisTest;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList3 a=new ArrayList3(4);
		a.add(5);
		a.add(5);
		a.add(5);
		a.add(5);
		a.add(5);
		
		
		a.print1();
		System.out.println(a.contains(51));
		a.add(4,10);
		a.print1();
		
		
	}

}
