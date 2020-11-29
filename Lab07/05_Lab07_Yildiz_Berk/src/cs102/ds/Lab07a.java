package cs102.ds;

public class Lab07a {

	public static void main(String[] args) {
		List list = new List();

		// adding to string to the list
		list.addToHead("a");
		list.addToHead("b");
		list.addToHead("c");
		list.addToHead("d");
		list.addToHead("e");

		System.out.println("Print:");
		System.out.println();
		list.print();
		System.out.println();

		System.out.println("Reverse Print:");
		System.out.println();
		list.printReverse();
		System.out.println();
		System.out.println();

		System.out.println("Add to tail:");
		System.out.println();
		list.addToTail("f");
		list.print();
		System.out.println();
		
		
		System.out.println("Index 4 is: " + list.getData(4));
		System.out.println("Index 15 is: " + list.getData(15));
		System.out.println();

		System.out.println("Remove From the Head:");
		System.out.println();
		list.removeFromHead();
		list.print();
		System.out.println();
		

	}

}
