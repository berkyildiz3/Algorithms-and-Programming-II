/**
 * This program calculates the first 100 prime numbers.
 */

/**
 * @author BERKYILDIZ
 * 21.02.2017
 */
public class PrimeNumbers {


	public static void main(String[] args) {
		
		//instance 
		IntBag prime; 
		prime = new IntBag();
		
		//calculate first 100 prime numbers.
		for(int i=2; i<=542; i++)
		{
			for(int j=2; j<=i; j++)
			{
				if(j==i)
				{
					prime.add(i);
				}
				if(i%j==0)
				{
					break;
				}
					
			}
		}
		
		//print the first 100 prime numbers.
		for(int k=0; k < 100; k++)
		{
			System.out.println(prime.get(k));
		}
		
		
		
		
		
		
		
	
	}

}
