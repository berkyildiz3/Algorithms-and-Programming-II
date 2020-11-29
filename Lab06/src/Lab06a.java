import java.util.*;
/*
 * A recursive Java method that counts the number of occurrences of the character "e" in a string.
 * Berk Yýldýz
 * 25.04.2017
 * */
public class Lab06a {

	static int numberOfOccurence = 0; 

	public static int count(String s, char c) 
	{
		//check for the length of the string
		if (numberOfOccurence >= s.length())
		{
			return 0;
		}

		numberOfOccurence++;

		//count the number of 'e'
		if(s.charAt(numberOfOccurence - 1) == c)
		{
			return count(s,c) + 1;
		}
		else
		{
			return count(s,c);
		}
	}

	public static void main(String[] args){

		String s = "";
		char c = 'e';

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		s = in.nextLine();

		System.out.println("Number of 'e': " + count(s,c));
	}
}

