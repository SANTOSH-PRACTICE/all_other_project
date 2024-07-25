package DefaultMethodusing;
// previus class name is StudentTest
public class GetterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentTest s=new StudentTest();
		s.setMarks(12);
		s.setName("Rahul");
		s.setRollNo(001);
		
		
		System.out.println(s.getName());
		System.out.println(s.getMarks());
		System.out.println(s.getRollNo());

	}

}
