import java.util.Scanner;

/**
 * A recursive method that takes a decimal value as an int parameter and prints out the binary equivalent of it on the console.
 * @author BERKYILDIZ 
 * 25.04.2017
 */

public class Lab06b {

	public static void binary(int num) 
	{	
		if (num > 1) 
		{
			binary(num / 2);
			System.out.print(num % 2);
		}
		else if (num == 1) 
		{
			System.out.print("1");
		}
		else 
		{
			System.out.print("0");
		}
	}

	public static void main(String[] args) {

		int num;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		num = in.nextInt();

		System.out.print("Binary equivalent: ");
		binary(num);
	}

}
