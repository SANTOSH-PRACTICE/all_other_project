package calsspract;

public abstract class Annonymousclass {
	abstract void displayDetails();
	
void m1()
{
	System.out.println("Hii from m1()");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annonymousclass t =new Annonymousclass() {
			
			void displayDetails() {
				System.out.println("Hii from display.....");
			}		
		};
		t.m1();
		t.displayDetails();
	}

}
