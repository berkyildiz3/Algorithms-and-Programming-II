import java.util.Scanner;
/**
 * This program is the tester of IntBag class. In this program users are able to make some operation by following instructions from menu.
 */

/**
 * @author BERKYILDIZ
 *21.02.2017
 */
public class IntBagTest {


	public static void main(String[] args) {

		//variables
		int option, size, value, position, testValue, sentinel;
		IntBag collection;

		collection = new IntBag();
		testValue = 0;
		sentinel = 0;


		Scanner in = new Scanner(System.in);


		while(sentinel == 0)
		{
			//menu options
			System.out.println("Choose an option (Enter a number)");
			System.out.println("(1) Create a new empty collection with a specified maximum capacity (any previous values are lost!)");
			System.out.println("(2) Read a set of positive values into the collection (use a negative value to indicate all the values have been entered.)");
			System.out.println("(3) Print the collection of values.");
			System.out.println("(4) Add a value to the collection of values at a specified location");
			System.out.println("(5) Remove the value at a specified location from the collection of values");
			System.out.println("(6) Read a single test value.");
			System.out.println("(7) Compute the set of locations of the test value within the collection");
			System.out.println("(8) Print the set of locations.");
			System.out.println("(9) Quit the program.");

			//ask user for option
			option = in.nextInt();

			//operate option 1
			if(option == 1)
			{
				//ask for size of the new collection
				System.out.print("Enter the size: ");
				size = in.nextInt();
				//create new collection with specified size
				collection = new IntBag(size);
			}

			//operate option 2
			if(option == 2)
			{
				//ask for values of collection
				System.out.print("Enter the values: ");
				value = 0;
				//add values into collection
				while(value >= 0)
				{
					value = in.nextInt();
					collection.add(value);
				}
			}

			//operate option 3
			if(option == 3)
			{
				//print out the elements of collection
				for(int i = 0; i < collection.size(); i++)
				{
					System.out.print(collection.get(i) + " ");
				}
				System.out.println(); 
			}

			//operate option 4
			if(option == 4)
			{
				//ask for value to be added
				System.out.print("Enter the value: ");
				value = in.nextInt();
				//ask for the index of new value
				System.out.print("Enter the position: ");
				position = in.nextInt();
				//add the given value into specified index
				collection.add(value, position);
			}

			//operate option 5
			if(option == 5)
			{
				//ask for index to be removed
				System.out.print("Enter the position that you want to remove: ");
				position = in.nextInt();
				
				//remove the specified index from collection
				collection.remove(position);
			}

			//operate option 6
			if(option == 6)
			{
				//ask for test value
				System.out.print("Please enter a test value: ");
				testValue = in.nextInt();
			}

			//operate option 7
			if(option == 7)
			{
				collection.findAll(testValue);
			}

			//operate option 8
			if(option == 8)
			{
				//print out the set of location
				System.out.println(collection.findAll(testValue));
			}

			//operate option 9
			//terminate program
			if(option == 9)
			{
				System.out.println("Bye");
				sentinel = -1;
			}
		}
	}
}
