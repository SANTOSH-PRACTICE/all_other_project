package secondpackage;

import Day14oops112.Protected1;//proteted is accessible to other package class but extend use

public class Protected3 extends Protected1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Protected3 t=new Protected3();
		t.method1();
		System.out.println(t.a+" "+t.m);

	}

}
