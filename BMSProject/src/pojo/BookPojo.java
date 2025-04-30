package pojo;

import java.time.LocalDate;
import java.util.Objects;

public class BookPojo {
	private int bookId;
	private String bookTitle;
	private int bookCost;
	private String bookAuthor;
	private LocalDate bookPublished;
	
	public BookPojo(int bookId, String bookTitle, int bookCost, String bookAuthor, LocalDate bookPublished) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookCost = bookCost;
		this.bookAuthor = bookAuthor;
		this.bookPublished = bookPublished;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getBookCost() {
		return bookCost;
	}

	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public LocalDate getBookPublished() {
		return bookPublished;
	}

	public void setBookPublished(LocalDate bookPublished) {
		this.bookPublished = bookPublished;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookAuthor, bookCost, bookId, bookPublished, bookTitle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookPojo other = (BookPojo) obj;
		return Objects.equals(bookAuthor, other.bookAuthor) && bookCost == other.bookCost && bookId == other.bookId
				&& Objects.equals(bookPublished, other.bookPublished) && Objects.equals(bookTitle, other.bookTitle);
	}
}
