package DefaultMethodusing;
class Address
{
	String StreetNo,city,state,country;
	public Address(String StreetNo,String city, String state,String country)
	{
		this.StreetNo=StreetNo;
		this. city= city;
		this.state=state;
		this.country=country;
		
	}
}

class Person
{
	String PName,PAdharNo,PJobNo,PJobLocation;
	int PJobId;
	
	Address address;
	public Person(Address address,String PName,String PAdharNo,String PJobNo,String PJobLocation,int PJobId)
	{
		this.address=address;
		this.PName=PName;
		this.PAdharNo=PAdharNo;
		this.PJobNo=PJobNo;
		this.PJobLocation=PJobLocation;
		this.PJobId=PJobId;
	}
	void display()
	{
		System.out.println(PName+" "+PAdharNo+" "+PJobNo+" "+PJobLocation+" "+PJobId+" "+address.StreetNo+" "+address.city+" "+address.state+" "+address.country);
	}
}
public class AddressDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person(new Address("1202","pune","maharashtra","india"),"santosh","123354","2332","pune",86777);
        p.display();
	}

}
 