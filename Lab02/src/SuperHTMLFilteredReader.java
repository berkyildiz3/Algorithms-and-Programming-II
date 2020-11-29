import java.util.ArrayList;

/**
 * This program lists the links from a html page.
 * @author BERKYILDIZ
 * 07.03.2017
 */
public class SuperHTMLFilteredReader extends HTMLFilteredReader {

	//properties	
	ArrayList<String> links = new ArrayList<String>();
	boolean cond;

	/**
	 * constructor
	 * @param URL given URL
	 */
	public SuperHTMLFilteredReader( String URL) 
	{
		super( URL);
	}

	/**
	 * Get the links from the html page
	 * @return list of links
	 */
	public ArrayList<String> getLinks()
	{
		for( int i=0; i < super.getPageContents().length() - 6; i++)
		{
			if( super.getPageContents().substring( i, i + 6).equals( "\"href=\""))
			{
				cond = true;
			}

			if( super.getPageContents().charAt(i)=='"')
			{
				cond = false;
			}
			if( cond)
			{
				links.add( super.getPageContents().substring( super.getPageContents().indexOf( "\"href=\""),super.getPageContents().indexOf( '"')) );
			}	
		}
		return links;
	}
}
