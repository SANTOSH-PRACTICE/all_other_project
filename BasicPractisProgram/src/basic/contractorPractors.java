package basic;

public class contractorPractors {

	 
		int num;
		String s;
		String num1;
		char ch;
		public contractorPractors(int num, String s, String num1, char ch) {
			super();
			
			this.num = num;
			this.s = s;
			this.num1 = num1;
			this.ch = ch;
		
		}
		int sum=0;
		int method(int num)
		{
			return sum=num+num;
			
		}
		  void display()
		{
			  method(num);
			System.out.println(sum);
		}
      
		public static void main(String[] args) {
			contractorPractors s=new contractorPractors(2,"s", "s", 's');
			s.display();
			
		}
	

}
