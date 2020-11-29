import java.util.Iterator;

/**
 * Tester for IntBagIterator
 * @author BERKYILDIZ
 * 21.03.2017
 */
public class TestIterator {

	 

	public static void main(String[] args) {
		
		IntBag bag = new IntBag(100);

		Iterator i, j;

		bag.add(1);
		bag.add(2);
		bag.add(3);
		bag.add(4);
		bag.add(5);
		
		
		
	/*	for(int k = 0; k < 10; k++)
		{
			bag.add(k);
		}*/

		i = new IntBagIterator( bag);

		while ( i.hasNext() ) 
		{
			System.out.println( i.next() );

			j = new IntBagIterator( bag);
			//j = bag.iterator();

			while ( j.hasNext() )
			{
				System.out.println( "--" + j.next() );
			}
		}
	}
}
