
/**
 * This program is the tester SimpleURLReader class.
 * @author BERKYILDIZ
 * 7.03.2017
 */
public class TestSimpleURLReader {


	public static void main(String[] args) {

		//properties
		MySimpleURLReader 	a; 
		HTMLFilteredReader  b;

		//create instance of MySimpleURLReader
		a = new MySimpleURLReader( "http://www.cs.bilkent.edu.tr/~david/housman.txt");

		//print the content of the poem
		System.out.println( a.getPageContents());

		System.out.println();
		System.out.println();

		//print the line count of the poem
		System.out.println( "Line Count: " + a.getLineCount());

		//create instance of HTMLFilteredreader
		b = new HTMLFilteredReader( "http://www.cs.bilkent.edu.tr/~david/housman.htm");

		//print the content of poem without html codes
		System.out.println( b.getPageContents());


	}
}
