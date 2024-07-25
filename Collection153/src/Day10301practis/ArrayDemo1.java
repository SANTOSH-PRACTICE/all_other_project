package Day10301practis;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList1 a=new ArrayList1();
		//1)add method
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(10);
		a.add(25);
		a.add(10);
	//	a.print();
		
		//2)remove method
       //  a.remove(5);
         
         a.print();
         //3)size method
         System.out.println(a.size());
         //4)contain method
         System.out.println(a.contains(30));//ture/false
         
        // 5) indexOf
         System.out.println(a.indexOf(45));//index||-1
         //6)lastIndexofv1
         System.out.println(a.lastIndexOfV1(10));
         //7)lastIndexofv2
         System.out.println(a.lastIndexOfV2(10));
         //8)add(int i,int num)
         a.add(1, 1000);
         a.print();
         //9)set(int i,int num)
         a.set(3, 50);
         a.print();
         //10)get(int i)
         System.out.println(a.get(5));
         
         //11)toarray method
         int arr[]=a.toArray();
        arr[1]=100;
        for(int x:arr)
        {
        	System.out.print(x+" ");
        }
        //12)tostring method
        System.out.println();
        System.out.println(a.toString());
	}

}
