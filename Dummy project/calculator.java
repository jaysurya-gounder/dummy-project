import java.lang.*;
import java.util.Scanner;

class calculator
{
	public static void main(String args[])
	{
		System.out.println("1 For Addition");
		System.out.println("2 For Subtraction");
		System.out.println("3 For Multiplication");
		System.out.println("4 For Division");
		System.out.println("4 For Quotient");
		Scanner in = new Scanner(System.in);
		int a, b, ch;
		System.out.println("Enter the no");
		ch = in.nextInt();
		switch(ch)
		{
		case 1 : System.out.print("Enter the no");
			a = in.nextInt();
			System.out.println("Enter the no");
			b= in.nextInt();
			System.out.println("Addition: "+(a+b));
			break;
		case 2 : System.out.print("Enter the no");
			a = in.nextInt();
			System.out.println("Enter the no");
			b= in.nextInt();
			System.out.println("Subtraction: "+(a-b));
			break;
		case 3 : System.out.print("Enter the no");
			a = in.nextInt();
			System.out.println("Enter the no");
			b= in.nextInt();
			System.out.println("Multiplication: "+(a*b));
			break;
		case 4 : System.out.print("Enter the no");
			a = in.nextInt();
			System.out.println("Enter the no");
			b= in.nextInt();
			System.out.println("Division: "+(a/b));
			break;
		case 5 : System.out.print("Enter the no");
			a = in.nextInt();
			System.out.println("Enter the no");
			b= in.nextInt();
			System.out.println("Quotient: "+(a%b));
			break;
		default : System.out.print("invalid");
			break;	
		}

	}
}
