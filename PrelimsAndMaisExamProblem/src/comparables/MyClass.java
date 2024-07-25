package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass {

//	public static void main(String[] args) {
//
//		List<Student> list=new ArrayList<Student>();
//		
//		list.add(new Student(2,"ram",40));
//		list.add(new Student(3,"sham",41));
//		list.add(new Student(4,"gotram",42));
//		list.add(new Student(21,"tukaram",40));
//		
//		Collections.sort(list);
//		System.out.println(list);
		public static void main(String[] args) {

			List<Student1>list=new ArrayList<Student1>();
			list.add(new Student1(1,"Soru",40));
			list.add(new Student1 (3,"Gomu",41));
			list.add(new Student1(2,"Gopa",41));
			list.add(new Student1(4,"Somya",38));
			
			Collections.sort(list);
			System.out.println(list);
			
		

		
		
		
	}

}
