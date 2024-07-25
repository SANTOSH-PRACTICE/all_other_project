package practis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student>list=new ArrayList<Student>();
		list.add(new Student(1,"Somu",40));
		list.add(new Student (3,"Gomu",41));
		list.add(new Student(2,"Aomya",39));
		list.add(new Student(4,"Somya",38));
		
		Collections.sort(list,new Abcd());
		System.out.println(list);
		

	}

}
