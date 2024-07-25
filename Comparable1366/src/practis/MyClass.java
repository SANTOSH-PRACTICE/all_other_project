package practis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass {

	public static void main(String[] args) {

		List<Student>list=new ArrayList<Student>();
		list.add(new Student(1,"Soru",40));
		list.add(new Student (3,"Gomu",41));
		list.add(new Student(2,"Gopa",41));
		list.add(new Student(4,"Somya",38));
		
		Collections.sort(list);
		System.out.println(list);
	}
 }
