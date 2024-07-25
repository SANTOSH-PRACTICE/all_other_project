package LinkedHashMapPractis;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		MyLinkedListHashMap<Integer,String> map=new MyLinkedListHashMap<>();
		map.add(10, "10");
		map.add(14, "14");
		map.add(15,"15");
		map.add(90, "90");
		
		
		
		//map.print();
		System.out.println(map.get(10));
	}

}
