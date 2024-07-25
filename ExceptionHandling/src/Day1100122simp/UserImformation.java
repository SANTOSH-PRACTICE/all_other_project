package Day1100122simp;

class InvalidAgeException extends Exception
{
	public 	 InvalidAgeException(String str)
	{
	super(str);
	}
}
class InvalidCountryException extends Exception
{
	public InvalidCountryException(String str)
	{
		super(str);
	}
}
   class UserResistration
   {
	   static void userProfile(int age,String country) throws InvalidAgeException, InvalidCountryException
	   {
		   if(age<18)
		   {
			   throw new InvalidAgeException("Age is less than 18");
		   }
		   else
		   {
			   System.out.println("Eligible for voting.....");
		   }
		   if(!country.equalsIgnoreCase("India"))
		   {
			   throw new InvalidCountryException("Citizen not indian");
		   }
		   else
		   {
			   System.out.println("Can proceed for voting");
		   }
		   		
	   }
   }

public class UserImformation {

	public static void main(String[] args) {
      try
      {
    	  UserResistration.userProfile(171, "india");
      }
      catch(InvalidAgeException e)
      {
    	  e.getMessage();
    	  System.out.println("Age invalid");
      }
      catch( InvalidCountryException ic)
      {
    	  System.out.println(ic.getMessage());
    	  System.out.println("country invalid");
      }
	}

}
