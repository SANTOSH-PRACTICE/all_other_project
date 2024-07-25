package conructorclass;

public class Bank {  // add amount class is part of this class
	int amount=5000;
	
Bank()
{
System.out.println("Sorry!!!! no amount added ....");
}

  Bank(int amount)
   {
	   this.amount=this.amount+amount;
   
   }
  void display()
  {
	  System.out.println("Final amount:"+amount);
  }
	
}
