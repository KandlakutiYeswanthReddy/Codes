package Java8.LambdaDemo;

import java.util.*;

public class BookService {

	public List<Book> getBookSort() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
		return books;

	}

	public static void main(String[] args) {
		System.out.println(new BookService().getBookSort());
	}
}
