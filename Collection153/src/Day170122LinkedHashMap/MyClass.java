package Day170122LinkedHashMap;

public class MyClass {

	public static void main(String[] args) {
		MylinkedHashMap<Integer,String> map=new MylinkedHashMap<>();
		map.add(12, "twelve");
		map.add(10, "ten");
		map.add(6, "six");
		map.add(15, "15");
		map.add(3, "three");
		map.add(2, "two");
		map.add(80, "80");
		map.add(20, "20");

		map.add(18, "18");

		map.print();
		System.out.println(map.get(6));

	}

}
