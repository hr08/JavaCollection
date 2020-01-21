package Assignment2;

import java.util.Comparator;

public class SortByQuantity implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		int r = o2.getQuantity()-o1.getQuantity();
		return r;
	}

}
