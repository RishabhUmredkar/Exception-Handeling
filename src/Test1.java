import java.util.Scanner;

public class Test1 {
	
	void div()
	{
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		a[1]=Integer.parseInt(sc.nextLine());
		a[2]=Integer.parseInt(sc.nextLine());
		
		if(a[2]==0)
		{
			throw new ArithmeticException("Number is not valid pls enter another number not 0(zero)");
		}
		else
		{
			a[2]=a[1]/a[2];
			System.out.println("Division= "+a[2]);
		}
	}

	public static void main(String[] args) {
	Test1 t=new Test1();	
	try
	{
		t.div();
	}
	catch(Exception e)
	{
		System.out.println("error msg exception: "+e);
	}
	}

}
