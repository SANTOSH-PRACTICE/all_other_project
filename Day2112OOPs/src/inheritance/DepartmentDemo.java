package inheritance;
class Department{
	String deptName,HOD;
	public Department(String deptName, String HOD) 
	{
		this.deptName=deptName;
		this.HOD=HOD;
	}
	String departmentDetails()
	{
		return deptName +" "+HOD;
		
	}
}
class StafMember extends Department{
	String memberName,qualification;
	public StafMember(String memberName, String qualification,String deptName, String HOD) {
	super(deptName, HOD);
	this.memberName=memberName;
	this.qualification=qualification;
	
}
	String showStaffMemberDetails()
	{
		return memberName +" "+qualification;
		
	}
	
}
public class DepartmentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StafMember s=new StafMember("Prakash","PHD","IT","abc");
		System.out.println("Department Details: "+s.departmentDetails());
		System.out.println("Staff member Details: "+s.showStaffMemberDetails());

	}

}
