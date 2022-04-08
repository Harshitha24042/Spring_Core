package Q1;

public class Customer {
	 int  Id;
	  String name;
	  long contact;
	  public Address address;
	public Customer(int id, String name, long contact, Address address) {
		super();
		Id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
		public void displaycust() {
			  System.out.println("The name of customer is "+name+"with Id "+Id+"and contact is: "+contact);
			  System.out.println("Address is"+address.toString());}
	}
}
