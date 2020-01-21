package Assignment2;

public class Book {
	private int members_id,quantity;
	private String name,author,publisher;
	
	public Book(int members_id,String name, String author, String publisher, int quantity) {
		this.setMembers_id(members_id);
		this.setName(name);
		this.setAuthor(author);
		this.setPublisher(publisher);
		this.setQuantity(quantity);
	}

	public int getMembers_id() {
		return members_id;
	}

	public void setMembers_id(int members_id) {
		this.members_id = members_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String toString() {
		return "\n Members_Id: "+members_id+" name: "+name+" authorName: "+author+" publisherName: "+publisher+
				" Quantity: "+quantity;
	}
}
