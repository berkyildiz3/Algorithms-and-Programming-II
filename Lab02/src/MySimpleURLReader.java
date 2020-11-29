import cs1.SimpleURLReader;

/**
 * This program modifies and implement get methods in to the SimpleURLReader class.
 * @author BERKYILDIZ
 * 07.03.2017
 */
public class MySimpleURLReader extends SimpleURLReader {

	//properties
	int count, i;


	/**
	 * constructor
	 * @param URL specified URL link
	 */
	public MySimpleURLReader( String URL) 
	{
		super( URL);
	}

	/**
	 * @return page content of the given URL.
	 */
	public String getURL()
	{
		return super.getPageContents();
	}

	/**
	 * Gets the name of the folder from given URL.
	 * @return name of the folder
	 */
	public String getName()
	{
		i = super.getPageContents().length() - 1;
		count = 0;
		while( super.getPageContents().charAt(i) != '/')
		{
			i--;
			count++;
		}
		return super.getPageContents().substring( super.getPageContents().length()-count, super.getPageContents().length());
	}

	/**
	 * @return page content by fixing the bug
	 */
	@Override
	public String getPageContents() 
	{
		return super.getPageContents().substring( 4, super.getPageContents().length()-1);
	}





}
