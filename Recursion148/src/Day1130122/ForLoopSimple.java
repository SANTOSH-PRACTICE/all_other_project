package Day1130122;

public class ForLoopSimple
{
	static void table(int num)
	{
		print(num,1);
		
	}

	private static void print(int num, int i) {
       if(i<=10)
       {
    	   System.out.println(num+"*"+i+"m"+"="+(num*i));
    	   i++;
    	   print(num,i);
       }
	}

	public static void main(String[] args) {
		table(2);

	}

}
