package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import pojo.BookPojo;

public class BookDaoCollectionImpl implements BookDao{

	List<BookPojo> allBooks;
	
	public BookDaoCollectionImpl() {
		allBooks = new ArrayList<>();
		allBooks.add(new BookPojo(101, "Harry Potter and The Order of Phoenix", 550, "J.K.Rowling", LocalDate.of(2005, 12, 12), ""));
		allBooks.add(new BookPojo(102, "Harry Potter and The Prisoner of Azkaban", 750, "J.K.Rowling", LocalDate.of(2015, 02, 02), ""));
		allBooks.add(new BookPojo(103, "Harry Potter and The Chambers of Secrets", 600, "J.K.Rowling", LocalDate.of(2007, 07, 07), ""));
	}

	@Override
	public List<BookPojo> getAllBooks() {
		return allBooks;
	}

	@Override
	public BookPojo getABook(int bookId) {
		BookPojo fetchedBook = null;
		for(BookPojo eachBook : allBooks) {
			if(eachBook.getBookId() == bookId) {
				fetchedBook = eachBook;
			}
		}
		return fetchedBook;
	}

	@Override
	public void deleteBook(int bookId) {
		allBooks.removeIf((eachBook) -> eachBook.getBookId() == bookId);
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		int newBookId = allBooks.get(allBooks.size() - 1).getBookId() + 1;
		newBook.setBookId(newBookId);
		allBooks.add(newBook);
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo editBook) {
		for(int i=0;i<allBooks.size();i++) {
			if(allBooks.get(i).getBookId() == editBook.getBookId()) {
				allBooks.set(i, editBook);
			}
		}
		return editBook;
	}
}
