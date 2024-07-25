package DefaultMethodusing;

import java.util.Scanner;

class Author
{
	String  AutorName,place;
	int age;
	public String getAutorName() {
		return AutorName;
	}
	public String getPlace() {
		return place;
	}
	public int getAge() {
		return age;
	}
	

public Author(String  AutorName,String place,int age)
{
	this.AutorName=AutorName;
	this.place=place;
	this.age=age;
	
	
}}
class Book{
	String name;
	float price;
	Author author;
	public Book(String name,float price,Author author)
	{
		this.name=name;
		this.price=price;
		this.author=author;
		
	}
	void showDetails() {
		System.out.println(name+" "+price+"  "+author.getAutorName());
	}
	
}

public class AutherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Details: ");
		System.out.println("Enter Book Name: ");
		String name=sc.next();
		System.out.println("Enter Price: ");
		float price=sc.nextFloat();
		System.out.println("Enter Author Name: ");
		String Aname=sc.next();
		
		System.out.println("Enter Author Place : ");
		String Aplace=sc.next();
		
		System.out.println("Enter age:");
         int age=sc.nextInt();
         
         Book b=new Book(name,price,new Author(Aname,Aplace,age));
         b.showDetails();

	}

}
