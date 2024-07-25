package practisSiglyLinkedList;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySinglyLinkedList a=new MySinglyLinkedList();
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);
		
//		a.add(4,1000);
//		a.remove(1);
		a.print();

		//System.out.println(a.get(-1));
		a.set(1, 1000);
		a.print();
//		String sa=a.toString();
//		System.out.println(sa);
	//	System.out.println(a.size());
		
		int arr[]=a.toArray();
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
			
		}
	}

}
