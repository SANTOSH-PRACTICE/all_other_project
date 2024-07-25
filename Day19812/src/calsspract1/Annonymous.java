package calsspract1;

public abstract class Annonymous {
	abstract void displayDetails();
	
void m1() 
	{
	System.out.println("hii from m1...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annonymous a=new Annonymous(){
		void displayDetails()
		{
			System.out.println("hii from display...");
		}
		};
		a.displayDetails();
		//a.m1();

	}

}
