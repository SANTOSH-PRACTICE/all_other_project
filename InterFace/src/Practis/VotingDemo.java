package Practis;

interface I1
{
	void registerUser();
	void requestingVotingNumber();
}

class Kids implements I1
{
	int age=9;

	@Override
	public void registerUser() {
		// TODO Auto-generated method stub
		if(age<12)
		{
			System.out.println("you have sucessfully Registred under kids");
		}
		else
		{
			System.out.println(" You have not sucessfully registred");
		}
		
	}

	
	public void requestingVotingNumber() {
		String type= "Kids";
		if(type=="Kids")
		{
		System.out.println("Sorry cannot go for voting because age must be greater than 12 vote");
		}
		
	}
	
}
class Adult implements I1
{
	int age=2;

	@Override
	public void registerUser() {
		// TODO Auto-generated method stub
		
		if(age>12)
		{
			System.out.println("You Have sucessfully rtegister under Adult");
		}
		else
		{
			System.out.println("You Have not sucessfully rtegister under Adult");

		}
		
	}

	@Override
	public void requestingVotingNumber() {
		String type="Adults";
		
			if(type=="Adults")
			{
		System.out.println("Your voting Id will be genreted within a day");
		
	}
			else
			{
				System.out.println("oops not done");
			}
			}
	
}


public class VotingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Details of kids:");
		Kids k=new Kids();
		k.registerUser();
		k.requestingVotingNumber();
		
		System.out.println("Details of Adult:");
		
		Adult a=new Adult();
		a.registerUser();
		a.requestingVotingNumber();

	}

}
