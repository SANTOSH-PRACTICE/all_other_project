package Day14oops112;

import java.util.Scanner;

public class EmployeeDemoA {
	
	protected int emp_id;
	public String emp_name;
	private float emp_salary;
	String emp_demp;
	
Scanner sc =new Scanner(System.in);
public void input()
{
	System.out.println("enter id:");
	emp_id=sc.nextInt();
	System.out.println("Enter name:");
	emp_name=sc.next();
	System.out.println("Enter salary: ");
	emp_salary=sc.nextFloat();
	System.out.println("enter dept:");
	emp_demp=sc.next();
	
}

    public void doPublic()
    {
    	System.out.println("Do public called :"+emp_name+"  "+ emp_id+" "+emp_salary+" "+emp_demp);
    }
     void doDefault()
    {
     	System.out.println("Do public called :"+emp_name+"  "+ emp_id+" "+emp_salary+" "+emp_demp);

    }
     protected void doProtected()
     {
     	System.out.println("Do public called :"+emp_name+"  "+ emp_id+" "+emp_salary+" "+emp_demp);

     }
     private void doPrivate()
     {
     	System.out.println("Do public called :"+emp_name+"  "+ emp_id+" "+emp_salary+" "+emp_demp);

     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDemoA a=new EmployeeDemoA();
		a.input();
		a.doPublic();
		a.doDefault();
		a.doProtected();a.doPrivate();

	}

}
