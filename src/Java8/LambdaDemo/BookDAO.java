package Java8.LambdaDemo;

import java.util.*;

public class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(101, "core Java", 109));
		books.add(new Book(102, "Spring Boot", 119));
		books.add(new Book(101, "Hibernate", 129));
		books.add(new Book(101, "RestFul Webservices", 139));
		return books;
	}
}
