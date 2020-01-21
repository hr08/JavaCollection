package Assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//import Assignment2.SortByName;

public class BookList {
	ArrayList<Book> book = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
	String ch = "y";
	String sortoption;

	public BookList() {	
		book.add(new Book(1,"HK","Paul","Genius",20));
		book.add(new Book(2,"Think","Steve","Ashirwad",30));
		book.add(new Book(3,"Why","Martin","NCERT",10));
		book.add(new Book(4,"NK","Guru","Infy",25));
		book.add(new Book(5,"Kite","Runner","Times",15));
		System.out.println(book);
		
		Iterator<Book> i = book.iterator();
		while(i.hasNext()) {
			Object obj = (Book)i.next();
			System.out.println(obj);
		}
	}

	public void sortByUser() {
		System.out.println("Do you want to sort ? : y/n");
		ch = sc.next();
	
		while(ch.equals("y")) {
			System.out.println("Enter the choice for Sorting : (Name/PublisherName/Quantity)");
			sortoption  = sc.next();
			if(sortoption.equals("Name")) {
				System.out.println("\nSorted By Name : ");
				SortByName n = new SortByName();
				book.sort(n);   //.sort(n);
				System.out.println(book);
			
			}
			else if(sortoption.equals("PublisherName")) {
				System.out.println("\nSorted by PublisherNmae: ");
				SortByPublisher p = new SortByPublisher();
				book.sort(p);
				System.out.println(book);
			}
			else if(sortoption.equals("Quantity")) {
				System.out.println("\nSorted by Quantity: ");
				SortByQuantity q = new SortByQuantity();
				book.sort(q);
				System.out.println(book);
			}
			else {
				System.out.println("Enter from the given choice!!");
			}
			System.out.println("Do you want to continue? (y/n)");
			ch = sc.next();
			if(ch.equals("n")) {
				System.out.println("Thank You !");
				break;
			}	
		}
		if(ch.equals("n")) {
			System.out.println("Exit");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookList b = new BookList();
		b.sortByUser();
	}

}
