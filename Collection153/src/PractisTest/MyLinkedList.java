package PractisTest;

public class MyLinkedList<d> {

	public static void main(String[] args) {
		LinkedList <Integer> a=new LinkedList<Integer>();
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);
		a.add(30);
		
		//a.remove(1);
		
		a.add(0, 1000);
		a.print();
	}

}
