package service;

import java.util.List;

import dao.BookDao;
import dao.BookDaoCollectionImpl;
import pojo.BookPojo;

public class BookServiceImpl{
	
	BookDao bookDao;
	
	public BookServiceImpl(){
		bookDao = new BookDaoCollectionImpl();
	}

	public List<BookPojo> getAllBooks() {
		return bookDao.getAllBooks();
	}

	public BookPojo getABook(int bookId) {
		return bookDao.getABook(bookId);
	}

	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
	}

	public BookPojo addBook(BookPojo newBook) {
		return bookDao.addBook(newBook);
	}

	public BookPojo updateBook(BookPojo editBook) {
		return bookDao.updateBook(editBook);
	}
}
