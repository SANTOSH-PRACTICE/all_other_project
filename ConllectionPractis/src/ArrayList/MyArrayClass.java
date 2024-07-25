package ArrayList;

public class MyArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(10);
		
		list.add(6, 78);

		
		//list.display();
		//System.err.println(list.contains(8));
//		System.out.println(list.lastIndexOf(10));
//		System.out.println(list.lastIndexOfV1(10));
		
		list.set(2, 100);
		list.display();
		System.out.println(list.get(1));
		int aa[]=list.toArray();
		for(int x:aa)
		{
			System.out.print(x+" ");
		}
		System.out.println(list.toString());
		list.remove(1);
		list.display();
	}

}
