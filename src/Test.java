import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	int a[]=new int[3];
	Scanner sc=new Scanner(System.in);
	try
	{System.out.println("Enter any 2 numbers:");
	a[1]=Integer.parseInt(sc.nextLine());
	a[2]=Integer.parseInt(sc.nextLine());
	a[3]=a[1]/a[2];
	System.out.println(a[3]);
	}
   catch (NumberFormatException e)
	{
	System.out.println("error 1: "+e);
	}
	catch(ArithmeticException e)
	{
		System.out.println("error 2: "+e);
	}
	catch(Exception e)
	{
		System.out.println("error msg exception: "+e);
	}
	finally
	{System.out.println("hello m finally block ;-)");
	System.out.println("Enter any one number:");
	try
	{
		int b=Integer.parseInt(sc.nextLine());
		b=b*b;
		System.out.println("Square = "+b);
	}
	catch(Exception e)
	{
		System.out.println("error msg exception: "+e);
	}
	}
	
	}

}
