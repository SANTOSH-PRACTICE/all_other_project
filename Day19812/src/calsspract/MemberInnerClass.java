package calsspract;

public class MemberInnerClass {//outer class
	int x=23;
	void m1()
	{
		System.out.println("Hi from outer class m1 method");
	}
	   class Sample{//inner class --->member inner class
		   int num1=10;
		   void display()
		   {
			   System.out.println("Calling from display....");
			   System.out.println("Num is:"+num1);
			   System.out.println(x);
			   m1();
		   }   
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInnerClass objectOuter=new MemberInnerClass();
		MemberInnerClass.Sample SampleInner=objectOuter.new Sample();
		SampleInner.num1=99;
		SampleInner.display();
		// outerClassName OuterClassObjet=new OuterClassName();
		// outerClassName.innerClassName.innerClassObject=outerClassName.new.InnerClassObject
}
}
