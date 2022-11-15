class PrintString1 
{
	public static void main(String args[]) 
	{
		StringThread1 t = new StringThread1 ("Java",50);
		t.start ( );
	}
}

class StringThread1 extends Thread 
{
	private String str;
	private int num;

	StringThread1 (String s, int n) 
	{
		str=new String (s);
		num=n;
	}
	
	public void run ( ) 
	{
		for (int i=1; i<=num; i++)
			System.out.print(str + " ");
	}
}