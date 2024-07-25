package Day5HashMap;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap<Integer,String>map=new MyHashMap<Integer,String>();
		map.add(10,"ten" );
		map.add(5,"five" );
		map.add(3,"three" );
		map.add(9,"nine" );
		map.add(2,"two" );
		map.add(1,"one" );
		map.add(6,"six" );
		map.print();
		System.out.println(map.contains(16));
		System.out.println(map.containValve("r"));
		System.out.println(map.get(11));
		System.out.println(map.size());
	}

}
