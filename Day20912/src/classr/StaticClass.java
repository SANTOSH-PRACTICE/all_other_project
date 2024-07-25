package classr;

public class StaticClass {
	
	static int x=10;
	static void m1()
	{
		System.out.println("m1 method calling...");
	}
	
	     static class Sample
	     {
	    	 int y=100;
	    	 static int z=78;
	    	 void samplem1()
	    	 {
	    		 System.out.println("Sample method Calling ..."+y+z);
	    		 System.out.println(x);
	    		 m1();
	    	 }
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// formule	outerClass.InnerClass objectName=new outerClass.InnerClass();
		StaticClass.Sample a=new StaticClass.Sample();
		a.samplem1();

	}

}
