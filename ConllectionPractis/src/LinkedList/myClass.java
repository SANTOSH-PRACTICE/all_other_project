package LinkedList;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myLInkedLIst list=new myLInkedLIst();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(10);
		
		//list.remove(5);
		//list.add(3,1000);
//		//list.set(2,2000);
//		System.out.println(list.get(2));
//		System.out.println(list.size());
//		System.out.println(list.contains(30));
//		System.out.println(list.indexOf(50));
//		
		System.out.println(list.lastIndexOf(10));
		
		list.print();
		
		int []aa=list.toArray();
		for(int x:aa)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println(list.toString());

	}

}
