package DoublyLinkedList;

public class Myclass {

	public static void main(String[] args) {

		
		MyDoublyLinkedList list=new MyDoublyLinkedList();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(10);
		list.add(25);
		list.add(10);
		
//		list.add(4,1000);
//		list.remove(5);
//		list.set(6,454444);

		//list.print();
		System.out.println(list.get(5));
		System.out.println(list.lastIndexOf(10));
		System.out.println(list.indexof(10));
		System.out.println(list.toString());
		System.out.println(list.size());
		
		int arr[]= list.toArray();
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(list.contain(60));
		
	}

}
