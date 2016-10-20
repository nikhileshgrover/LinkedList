
public class Link {
	public int dataElementInt;
	public String dataElementString = new String();
	public Link nextLink;
		
	public Link(int dei, String des) {
		dataElementInt = dei;
		dataElementString = des;
	//	System.out.println("Creating Link: Data Element 1: " + dataElementInt + " Data Element 2: " + dataElementString);
	}
	
	public void printLink(int count) {
		System.out.println("Data Element: " + count + ": " + dataElementInt + " Data Element 2: " + dataElementString);
	}

}
