package Day3050122class;

public class MyClass {

	public static void main(String[] args) {
		 MyDoublyLinkedList<Integer> list=new  MyDoublyLinkedList();
		 //1)add method
		 list.add(5);
		 list.add(10);
		 list.add(15);
		 list.add(20);
		 list.add(25);
		 list.add(10);
	//	 list.printFor();
//		 
////		 //2)printfor method
////		 System.out.println("Forward print");
////		 list.printFor();
////		 System.out.println("reverse print");
////		 
//		 //3)printrev method
//		 list.printRev();
		 //4)remove
//		 list.remove(5);
//		 list.printFor();
//		 //5)add method
//		 list.add(2, 18);
//		 list.printFor();
		 //6)set method
		 list.set(0, 17);
		 list.printFor();
		 //7)get method
		 System.out.println(list.get(1));
		 
		 //8)size method
//		 System.out.println(list.size());
		 //9)contain method
//		 System.out.println(list.cointans(50));
		 //10)index of method
		 System.out.println(list.indexOf(95));
		 //11)last indexof method
		 System.out.println(list.lastIndexOf(10));
		 //12)toArray method
		 Object [] arr=list.toArray();
		 for (int i = 0; i < arr.length; i++)
		 {
			System.out.print(arr[i]+" ");
		}
		 System.out.println();
		 //13)tostring method
		 System.out.println(list);
	}

}
