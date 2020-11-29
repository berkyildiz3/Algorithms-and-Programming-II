package cs102.ds;

public class Stack {
  
   private List list;
   
   /**
    * The constructor
    */
   public Stack(){
      list = new List();
   }
   
   /**
    * Adds an element to the top of the stack
    * @param element the element to add
    * @return element
    */
   public String push(String element){
      list.addToHead(element);
      return element;
   }
   
   /**
    * Removes the element from the top of the stack
    * @return the removed element
    */
   public String pop(){
      String removed = list.getData(0);
      list.removeFromHead();
      return removed;
   }
   
   /**
    * Checks whether the list is empty or not
    * @return false if the list is empty, true otherwise
    */
   public boolean isEmpty(){
      return list.isEmpty();
   }
}