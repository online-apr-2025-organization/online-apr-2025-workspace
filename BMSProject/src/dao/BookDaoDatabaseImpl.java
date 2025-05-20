package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import pojo.BookPojo;

public class BookDaoDatabaseImpl implements BookDao{

	@Override
	public List<BookPojo> getAllBooks() {
		List<BookPojo> allFetchedBooks = new ArrayList<>();
		Connection con = DBUtil.makeConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(DBQueries.BOOKS_ALL);
			// traverse through the result set and copy the records into bookpojo objects and add it to a collection
			while(rs.next()) {
				BookPojo book = new BookPojo(rs.getInt("book_id"), rs.getString("book_title"), rs.getInt("book_cost"), rs.getString("book_author_id"), LocalDate.parse(rs.getString("book_published")), rs.getString("book_image_url"));
				allFetchedBooks.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allFetchedBooks;
	}

	@Override
	public BookPojo getABook(int bookId) {
		BookPojo fetchedBook = null;
		Connection con = DBUtil.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(DBQueries.BOOKS_EACH);
			pstmt.setInt(1, bookId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				fetchedBook = new BookPojo(rs.getInt("book_id"), rs.getString("book_title"), rs.getInt("book_cost"), rs.getString("book_author_id"), LocalDate.parse(rs.getString("book_published")), rs.getString("book_image_url"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fetchedBook;
	}

	@Override
	public void deleteBook(int bookId) {
		Connection con = DBUtil.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(DBQueries.BOOKS_DELETE);
			pstmt.setInt(1, bookId);
			int rowsAffected = pstmt.executeUpdate();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		
		return null;
	}

	@Override
	public BookPojo updateBook(BookPojo editBook) {
		
		return null;
	}

}
