package abtracrtt;
 abstract class Student123
 {
	 void display()
	 {
		 System.out.println("Hii..");
	 }
	 abstract void showMessage();
 }
public class AbsractTest extends Student123
{
	@Override
	void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Good morning...");
	}
	public static void main(String[] args) {
	AbsractTest s=new AbsractTest();
	s.display();
	s.showMessage();
	}
}
