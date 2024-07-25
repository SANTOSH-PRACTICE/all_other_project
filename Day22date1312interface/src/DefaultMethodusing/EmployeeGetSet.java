package DefaultMethodusing;

import java.util.Scanner;

class Employee
{
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

public class EmployeeGetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
        System.out.println("Enter Name: ");
        emp.setName(sc.next());
        System.out.println("Enter Id: ");
        emp.setId(sc.nextInt());
        System.out.println(emp.getName()+" "+emp.getId());

	}

}
