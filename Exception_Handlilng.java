import java.util.Scanner;

public class Exception_Handling
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);	
	
		// arithmetic exception (divide by zero)
		/*
		int num, den;
		System.out.println("enter numerator");
		num = sc.nextInt();

		System.out.println("enter denominator");
		den = sc.nextInt();
		
		try
		{
			System.out.println("division is = " + (num/den));
		}
		catch(Exception omk)
		{
			System.out.println("division is not possible because " + omk);
		}
		*/			

		// index out of bound exception
		/*
		int arr[] = new int[5];
		arr[0] = 27;
		arr[1] = 26;
		arr[2] = 25;
		arr[3] = 24;
		arr[4] = 23;

		int pos;
		System.out.println("enter index from which you want value");
		pos = sc.nextInt();
		
		try
		{
			System.out.println("value at " + pos + " index is = " + arr[pos]);
		}
		catch(Exception e)
		{
			System.out.println("unable to give value because " + e);
		}
		*/

	}
}
