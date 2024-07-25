package Day4Practis;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassTree tree=new MyClassTree();
		tree.add(10, "ten");
		tree.add(15, "fifteen");
		tree.add(7, "sev");
    	tree.add(3, "three");
		tree.add(18, "18");
		tree.add(7, "seven");
		tree.add(1, "one");

        tree.print();
        
        String result= tree.get(1000);
        System.out.println(result);
       
	}

}
