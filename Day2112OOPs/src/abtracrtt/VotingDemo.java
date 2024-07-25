package abtracrtt;
interface votingApp{
	void registerUser();
	void requestedVotingNumber();
}

class Kids implements votingApp{
	public void registerUser() {
		int age=9;
		if(age<12)
		{
			System.out.println("You have sussesfully registr under kid section");
		}
		else
		{
			System.out.println("not Done");
		}
		
	}
	public void requestedVotingNumber() {
		String type ="Kids";
		if(type=="Kids")
		{
			System.out.println("Sorry !!not done");
		}
	}
}
class Adults implements votingApp{
	public void registerUser() {
		int age=25;
		if(age>12)
		{
			System.out.println("You have sussesfully registr under adult section");
		}
		else
		{
			System.out.println("not Done");
		}
		
	}
	public void requestedVotingNumber() {
		String type ="Aduls";
		if(type=="Aduls")
		{
			System.out.println("Your voting id genreted within 1 day");
		}
		else 
		{
			System.out.println("OOps you not done ");
		}
	}}
public class VotingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kids k=new Kids();
		k.registerUser();
		k.requestedVotingNumber();
		
		Adults a=new Adults();
		a.registerUser();
		a.requestedVotingNumber();

	}

}
