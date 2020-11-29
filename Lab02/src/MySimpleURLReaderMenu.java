import java.util.Scanner;
import java.util.ArrayList;

/**
 * Menu for using the properties of Simple URL Reader 
 * @author BERKYILDIZ
 * 07.03.2017
 */
public class MySimpleURLReaderMenu {


	public static void main(String[] args) {

		//properties;
		boolean 						cond;
		int 							selection;
		ArrayList<MySimpleURLReader>    collection;
		MySimpleURLReader 				poem1;
		String 							url;
		int 							index;
		HTMLFilteredReader 				poem2;

		//instance
		collection = new ArrayList<MySimpleURLReader>();

		Scanner in = new Scanner(System.in);

		cond = true;
		do
		{
			//menu options
			System.out.println( "(1) Enter the url of poem to add to collection");
			System.out.println( "(2) List all poems in the collection");
			System.out.println( "(3) Quit");
			System.out.println( "First enter the menu option!");
			selection = in.nextInt();

			//compute option 1
			if ( selection == 1)
			{
				//ask for url
				System.out.print( "Enter the url: ");
				url = in.next();

				//if url is text, then create an instance of MySimpleURLReader
				if( url.substring(url.length() - 4, url.length() - 1).equals( "txt"))
				{
					poem1 = new MySimpleURLReader( "url");
					collection.add( poem1);
				}

				//if url is html, then create an instance of HTMLFilteredReader
				else if(url.substring(url.length() - 4, url.length() - 1).equals( "htm"))
				{
					poem2 = new HTMLFilteredReader( "url");
					collection.add( poem2);
				}
			}

			//compute option 2
			else if ( selection == 2)
			{
				//list the all elements of collection
				for( int i=0; i < collection.size(); i++)
				{
					System.out.println( collection.get(i) + ": " + collection.get(i).getName());
				}

				System.out.println();

				//ask for index
				System.out.print( "Enter an index to view poem: ");
				index = in.nextInt();

				//print information of specified index
				if( index < collection.size())
				{
					System.out.println( collection.get( index).getPageContents());
				}

				//return main menu
				else if( index == collection.size())
				{
					System.out.println( "(1) Enter the url of poem to add to collection");
					System.out.println( "(2) List all poems in the collection");
					System.out.println( "(3) Quit");
					System.out.println( "First enter the menu option!");
					selection = in.nextInt();
				}
				//if user enters an invalid index, ask for a valid one
				else
				{
					System.out.print( "Enter a valid index: ");
					index = in.nextInt();
				}
			}
			//compute option 3 and quit the program
			else if ( selection == 3)
			{
				cond = false;
			}
		}
		while( cond);	
	}
}
