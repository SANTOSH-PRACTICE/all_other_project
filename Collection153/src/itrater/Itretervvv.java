package itrater;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Itretervvv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer>set=new  LinkedHashSet<>();
		set.add(78);
		set.add(11);
		set.add(13);

		set.add(98);

		set.add(88);
		set.add(56);
		set.add(78);
		set.add(34);
		set.add(43);
		Iterator<Integer>it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
