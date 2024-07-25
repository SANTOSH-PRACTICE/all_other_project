package listpractis;

import java.util.ArrayList;
import java.util.List;

public class myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list= new  ArrayList<Student>();
		list.add( new Student("santosh",1,123344343) );
		list.add(new Student("raja",1,123344343));
		//collection.sort(list);
		
		System.out.println(list);
		

	}

}
