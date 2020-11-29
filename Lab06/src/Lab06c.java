import java.util.ArrayList;
/**
 * a recursive method that returns true if the strings in the array are in lexicographic (effectively alphabetic) order, and false otherwise.
 * @author BERKYILDIZ
 * 25.04.2017
 */


public class Lab06c {


	public static boolean compareTo(ArrayList<String> list)
	{
		String s1 = "";
		for (String s2: list) 
		{
			if (s2.compareTo(s1) < 0)
			{
				return false;
			}
			s1 = s2;
		}
		return true;
	}

	public static void main(String []args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();

		list1.add("ali");
		list1.add("berk");
		list1.add("ceren");
		list1.add("deniz");

		list2.add("z");
		list2.add("y");
		list2.add("x");

		System.out.println(compareTo(list1));
		System.out.println(compareTo(list2));
	}
}