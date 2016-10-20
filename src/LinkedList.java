
public class LinkedList {
	//An object of the class Link gets created
	private Link first;
	private Link last;
	
	public LinkedList() {
		//Object of class Link called first gets set to null
		first = null;
	}
	
	public void insertLink(int dei, String des) {
		//Creates an object of class Link and initializes the variables
		Link link = new Link(dei, des);
		
		//Sets the value of nextLink to null
		link.nextLink = first;
		
		//Inserts the value of the initialized Link Object into first
		/*
		 	FirstLink created
		 	{
		 		Link.dataElementInt = 1;
		 		Link.dataElementString = "One";
		 		Link.nextLink = null;
		 	}
		 	SecondLink created
		 	{
		 		Link.dataElementInt = 2;
		 		Link.dataElementString = "Two";
		 		Link.nextLink = FirstLink;
		 	} 
		 	ThirdLink created
		 	and so on
		 	Basically the link gets created like this
		 	ThirdLink->SecondLink->FirstLink.nextLink = null;
		 */
		first = link;
	}
	
	public void insertLinkBetween(int betA, int betB, int dei, String des) {
		Link currentLink = first;
		Link link = new Link(dei, des);
		int count = getLinkedListCount(currentLink);
						
		while (currentLink != null) {
			if(count == betB) {
				link.nextLink = currentLink.nextLink;
				currentLink.nextLink = link;
			}
			else
				currentLink = currentLink.nextLink;
			count--;
		}
	}
	
	public int getLinkedListCount(Link firstLink) {
		int retCount = 0;
		Link currentLink = firstLink;
		if (firstLink == null)
				currentLink = first;
		
		while (currentLink != null) {
			retCount++;
			currentLink = currentLink.nextLink;
		}
		return retCount;
	}
	
	public Link getLastLink() {
		Link currentLink = first;
		Link lastLink = null;
		while (currentLink !=null) {
			if(currentLink.nextLink == null)
				lastLink = currentLink;
			currentLink = currentLink.nextLink;
		}
		return lastLink;
	}
	
	public void deleteLinkNumber(int linkNumber) {
		
		//Link lastLink = getLastLink();
		
		Link currentLink = first;
		Link firstLink = currentLink;
		int linkCount = 1;
		
		
		
		while (first != null) {
			if (linkCount == linkNumber) {
				first.nextLink = first.nextLink.nextLink;
				//System.out.println("Deleted one link: " + linkCount);
			}
			else {
				first = first.nextLink;
				//System.out.println("Not deleting: " + linkCount);
			}
			linkCount++;	
		}
		first = firstLink;
		//System.out.println("dd" + first.nextLink.nextLink.nextLink.nextLink.nextLink.dataElementInt);
		
		
		
		
		//first.nextLink.nextLink.nextLink = first.nextLink.nextLink.nextLink.nextLink.nextLink;
		
		/*
		int count = getLinkedListCount(first);
		Link firstLink = first;
		Link currentLink = first;
		
		first.nextLink.nextLink.nextLink = first.nextLink.nextLink.nextLink.nextLink; 
		
		System.out.println("Count of initial list: " + count);
		
		while (currentLink !=null) {
			if (count-linkNumber != 1) {
				currentLink = currentLink.nextLink;
				System.out.println("Not deleting: " + count);
			}
			else {
				currentLink = currentLink.nextLink.nextLink;
				System.out.println("Deleted one link: " + count);
			}
			count--;
		}
		*/
	}
	
	
	public void printList() {
		/*
		 	In the class LinkedList, first is always the first link from the LEFT. For example below
			ThirdLink->SecondLink->FirstLink.nextLink = null;
			first = ThirdLink;
		 */
		
		Link currentLink = first;
		int count = 1;
		while (currentLink != null) {
			currentLink.printLink(count);
			count++;
			currentLink = currentLink.nextLink;
		}
	}
}