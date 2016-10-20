
public class TestLinkedList {
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.insertLink(1, "one");
		
		ll.insertLink(2, "two");
		
		ll.insertLink(3, "three");
		
		ll.insertLink(4, "four");
		
		ll.insertLink(5, "five");
		
		ll.insertLink(6, "six");
		
		ll.insertLink(7, "seven");
		
		ll.insertLink(8, "eight");
			
		//Insert the value 5.5 and "Five dot Five" between the fifth and 6th link
		ll.insertLinkBetween(5, 6, 55, "Five dot Five");
	
		ll.printList();
		
		System.out.println(ll.getLinkedListCount(null));
		
		ll.deleteLinkNumber(1);
		
		//Gets me a count of all the Links in the LinkedList
		System.out.println(ll.getLinkedListCount(null));
		ll.printList();
	}
}
