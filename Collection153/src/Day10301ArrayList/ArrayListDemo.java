package Day10301ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	ArrayList abcd=new ArrayList(5);//overload constructor
		ArrayList abcd=new ArrayList(); //default constructor
       
		abcd.add(5);
		abcd.add(10);
		abcd.add(15);
		abcd.add(20);
		abcd.add(25);
		abcd.add(30);
		abcd.add(10);
	 abcd.print();
		 System.out.println("remove method");
	
	     abcd.remove(4);//enter the index the element is removed
//	     abcd.print();
////	    
//		 System.out.println(abcd.size());
//		 System.out.println(abcd.lastIndexOfV2(10));//last index
//		 System.out.println(abcd.lastIndexOfV1(10));//last index
//		 System.out.println(abcd.contains(30));//ture /false
//          System.out.println(abcd.indexOf(15));//index
        
	 
	 
	// add method
          abcd.add(2, 45);
          abcd.print();
		
		
       //set method   
         abcd.set(3, 46);
          abcd.print();
          
          //get method
          abcd.get(1);
          System.out.println(abcd.get(1));
          
          
          //toString method
        // System.out.println(abcd.toString());
        
          //toArraymethod
         int arr[]=abcd.toArray();
         arr[1]=1000;
         for(int x:arr)
         {
        	 System.out.print(x+" ");
         }
         
           
            
	}

}
