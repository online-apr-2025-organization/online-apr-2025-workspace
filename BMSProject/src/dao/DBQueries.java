package dao;

public class DBQueries {
	static final String BOOKS_ALL = "select * from book_details";
	static final String BOOKS_EACH = "select * from book_details where book_id = ?";
	static final String BOOKS_DELETE = "delete from book_details where book_id = ?";
}
