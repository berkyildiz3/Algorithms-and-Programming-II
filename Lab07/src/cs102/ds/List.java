package cs102.ds;

public class List {

	// inner class
	private class Node {
		Node next;
		String data;

		public Node(String dataValue) {
			next = null;
			data = dataValue;
		}
	}

	// property
	private Node head;

	// constructor
	public List() {
		head = null;
	}

	/**
	 * Removes the header
	 * 
	 * @return toString after removing
	 */
	public String removeFromHead() {
		if (head == null) {
			System.out.println("Empty List!");
			return null;
		} 
		else {
			String temp = head.data;
			head = head.next;
			return temp;
		}
	}

	/**
	 * 
	 * @param item
	 * @return item
	 */
	public String addToTail(String item) {
		Node insertNode = new Node(item);
		if (head == null) {
			head = insertNode;
		} else {
			Node current = head;
			while( current.next != null ) {
				current = current.next; 
			}// current is the tail
			
			current.next = insertNode;
		}
		return item;
	}

	/**
	 * Adds the data to the head
	 * @param data
	 */
	public void addToHead(String item) {
		if (head == null) {
			head = new Node(item);
		} else {
			Node newNode = new Node(item);
			newNode.next = head;
			head = newNode;
		}
	}

	/**
	 * Gets the element in the index
	 * @param index
	 * @return the element in the index
	 */
	public String getData(int index) {
		if (index < 0)
			return null;

		else if (head != null) {
			Node current = head;
			for (int i = 0; i < index; i++) {
				if (current.next == null)
					return null;
				current = current.next;
			}
			return current.data;
		} else
			return null;

	}

	/**
	 * Checks if the list is empty or not
	 * @return true if the list is empty, false otherwise
	 */
	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	/**
	 * Prints in reverse order
	 */
	public void printReverse() {
		helperPrintReverse(head);
	}

	private void helperPrintReverse(Node node) {
		if (node.next != null) {
			helperPrintReverse(node.next);
		}
		System.out.print(" " + node.data + " ");
	}

	/**
	 * Prints the elements
	 */
	public void print() {
		if (head != null) {
			Node current = head;
			while (current != null) {
				System.out.print(" " + current.data + " ");
				current = current.next;
			}
		}
		System.out.println();
	}

}