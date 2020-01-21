package Assignment2;

import java.util.Comparator;

public class SortByPublisher implements Comparator<Book>{

	@Override
	public int compare(Book p1, Book p2) {
		// TODO Auto-generated method stub
		String s1 = p1.getPublisher();
		String s2 = p2.getPublisher();
		int r = s1.compareTo(s2);
		return r;
	}
	
}
