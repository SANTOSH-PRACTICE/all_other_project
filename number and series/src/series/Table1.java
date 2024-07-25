package series;

import java.util.Scanner;

public class Table1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number we want table: ");
		int num=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(num+" *"+  i +"=" +num*i);
			i++;
		}
		
	}

}
