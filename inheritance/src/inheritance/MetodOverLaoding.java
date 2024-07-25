package inheritance;

class Santosh
{
void detail(String name)
{
	System.out.println("name: "+name);
}
void detail(String name,String surname,long contactnumber)
{
	System.out.println("name: "+name+" surname: " +surname+ " contact number: "+contactnumber);
}

}

public class MetodOverLaoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Santosh a=new Santosh();
		a.detail("Santosh");
		a.detail("Santosh","Honrao" , 976601318);

		
	}

}
