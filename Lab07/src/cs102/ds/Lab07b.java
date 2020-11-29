package cs102.ds;

import java.util.Scanner;

public class Lab07b {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Stack stack = new Stack();
		int result = 0;

		System.out.print("Enter the expression: ");
		String expr = scan.nextLine();

		for (int i = 0; i < expr.length(); i++) {
			if (Character.isDigit(expr.charAt(i))) {
				stack.push(expr.charAt(i) + "");
			} 
			else 
			{
				int first = Integer.parseInt(stack.pop());
				int second = Integer.parseInt(stack.pop());
				if (expr.charAt(i) == '+') {
					result = second + first;
				} else if (expr.charAt(i) == '-') {
					result = second - first;
				} else if (expr.charAt(i) == '*') {
					result = second * first;
				} else if (expr.charAt(i) == '/') {
					result = second / first;
				} 
				stack.push(result + "");
			}
		}
		
		scan.close();

		System.out.println("Result = " + stack.pop());
	}
}