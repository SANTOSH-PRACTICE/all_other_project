package Day5PractisHashMap;

public class MyClass {

	public static void main(String[] args) {
		 MyHashMap a=new  MyHashMap();
		 a.add(10,"ten");
		 a.add(15, "fiftin");
		 a.add(5, "five");
		 a.add(7, "seven");
		 a.add(3, "three");
		 a.add(18, "18");
		 a.add(12, "twelve");
		 a.print();
		 System.out.println(a.size());
		 System.out.println(a.contain(11 ));

	}

}
