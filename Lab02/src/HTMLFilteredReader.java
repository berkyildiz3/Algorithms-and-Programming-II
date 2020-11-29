import java.util.ArrayList;

/**
 * This program filters the html codes in code segments and turns the code segment in to a plain text.
 * @author BERKYILDIZ
 * 7.03.2017
 */
public class HTMLFilteredReader extends MySimpleURLReader {

	//properties
	int start, end, k;


	ArrayList<String> links = new ArrayList<String>();

	/**
	 * constructor
	 * @param URL given URL
	 */
	public HTMLFilteredReader( String URL) 
	{
		super( URL);
	}

	/**
	 * Get the unfiltered page with html codes.
	 * @return page content with html codes.
	 */
	public String getUnfilteredPageContents()
	{
		return super.getPageContents().substring( 4, super.getPageContents().length() - 1);
	}

	/**
	 * Get the filtered page content without html codes.
	 * @return filtered page content
	 */
	@Override
	public String getPageContents() 
	{	
		String result = "";
		boolean cond = true;	

		for( i = 0; i < super.getPageContents().length() - 1; i++)
		{
			if( super.getPageContents().charAt(i) == '<')
			{
				cond = false;
			}
			if( cond)
			{
				result = result + super.getPageContents().charAt(i);
			}
			if( super.getPageContents().charAt(i) == '>')
			{
				cond = true;
			}

			super.getPageContents().replaceAll("&nbsp;", "     ");
			super.getPageContents().replaceAll("&quot;", "     ");

		}
		return result;
	}
}
