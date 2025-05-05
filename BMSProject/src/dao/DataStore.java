package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import pojo.BookPojo;

// please ignore this class, it is not used in the application
public class DataStore {
	static private DataStore dataStore = null;
	private List<BookPojo> allBooks;
	
	private DataStore() {
		allBooks = new ArrayList<>();
		allBooks.add(new BookPojo(101, "Harry Potter and The Order of Phoenix", 550, "J.K.Rowling", LocalDate.of(2005, 12, 12), ""));
		allBooks.add(new BookPojo(102, "Harry Potter and The Prisoner of Azkaban", 750, "J.K.Rowling", LocalDate.of(2015, 02, 02), ""));
		allBooks.add(new BookPojo(103, "Harry Potter and The Chambers of Secrets", 600, "J.K.Rowling", LocalDate.of(2007, 07, 07), ""));
	}
	
	static DataStore getInstance() {
		if(dataStore == null) {
			dataStore = new DataStore(); 
		}
		return dataStore;
	}

	public List<BookPojo> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(List<BookPojo> allBooks) {
		this.allBooks = allBooks;
	}
	
	
}
