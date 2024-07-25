package HashMap;

public class MyClass<k,v> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		MyHashMap<Integer,String> map=new MyHashMap<Integer,String>();
		map.add(5, "five");
		map.add(11 ,"11" );
		map.add( 13,"13" );
		map.add(14 ,"14" );
		map.add(3 ,"3" );
		map.add(2 ,"2" );
		map.add(16 ,"16" );
		map.add(18 ,"18" );
		map.add( 19,"19" );
		map.add( 22,"22" );
		map.print();
		System.out.println(map.size());
		System.out.println(map.contain(14));
		System.out.println((map.containValue("12")));
		System.out.println(map.get(17));
		
		
		
		
	}

}
