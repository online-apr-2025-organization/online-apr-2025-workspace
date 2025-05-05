import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import pojo.BookPojo;
import service.BookServiceImpl;

public class BMSDemo {

	public static void main(String[] args) {
		  
		BookServiceImpl bookService = new BookServiceImpl();
		Scanner scan = new Scanner(System.in);
		char ch = 'n';
		
		do {
			System.out.println("***********************************");
			System.out.println("WELCOME TO BOOK MANAGEMENT SYSTEM");
			System.out.println("***********************************");
			System.out.println("1. Add a Book");
			System.out.println("2. Fetch a Book");
			System.out.println("3. Delete a Book");
			System.out.println("4. Update a Book");
			System.out.println("5. List all Books");
			System.out.println("6. Exit");
			System.out.println("***********************************");
			System.out.println("Enter your option ? ");
			int option = scan.nextInt();
			System.out.println("***********************************");
			switch(option) {
				case 1 -> 
				{
					System.out.println("Enter Book Title :");
					scan.nextLine();
					String bookTitle = scan.nextLine();
	
					System.out.println("Enter Book Cost :");
					int bookCost = scan.nextInt();
					
					System.out.println("Enter Book Author :");
					scan.nextLine();
					String bookAuthor = scan.nextLine();
					
					System.out.println("Enter Book Published (DD/MM/YYYY):");
					LocalDate bookDate = LocalDate.parse(scan.next());
					
					BookPojo newBook = new BookPojo(0, bookTitle, bookCost, bookAuthor, bookDate, "");
					
					BookPojo addedBook = bookService.addBook(newBook);
					System.out.println("***********************************");
					System.out.println("Book with ID: " + addedBook.getBookId() + " is added successfully!!");
					System.out.println("***********************************");
				}
				case 2 ->
				{
					System.out.println("***********************************");
					System.out.println("Enter the book ID of the book to be fetched: ");
					int fBookId = scan.nextInt();
					BookPojo fetchedBook = bookService.getABook(fBookId);
					if(fetchedBook == null) {
						System.out.println("Sorry book with ID : " + fBookId + " does not exist!!");
					}else {
						System.out.println(fetchedBook);
					}
					System.out.println("***********************************");
				}
				case 3 ->
				{
					System.out.println("***********************************");
					System.out.println("Enter the book ID of the book to be removed: ");
					int fBookId = scan.nextInt();
					BookPojo fetchedBook = bookService.getABook(fBookId);
					if(fetchedBook == null) {
						System.out.println("Sorry book with ID : " + fBookId + " does not exist!!");
					}else {
						System.out.println(fetchedBook);
						System.out.println("***********************************");
						System.out.println("Are you sure to remove the book with ID: " + fBookId + " (y/n) :");
						char confirmDelete = scan.next().charAt(0);
						if(confirmDelete == 'y') {
							bookService.deleteBook(fBookId);
							System.out.println("Book with ID: " + fBookId + " removed successfully!!");
							System.out.println("***********************************");
						}
					}
				}
				case 4 ->
					System.out.println("Book updated successfully!!");
				case 5 ->
				{
					System.out.println("***********************************");
					List<BookPojo> fetchedAllBooks = bookService.getAllBooks();
					fetchedAllBooks.forEach((book) -> System.out.println(book));
					System.out.println("***********************************");
				}
				case 6 ->
				{
					System.out.println("***********************************");
					System.out.println("THANKYOU FOR USING BOOK MANAGEMENT SYSTEM");
					System.out.println("***********************************");
					System.exit(0);
				}
				default ->
					System.out.println("Please enter valid menu option!!");
			}
			System.out.println("Do you want to continue? (y/n) ");
			ch = scan.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		System.out.println("***********************************");
		System.out.println("THANKYOU FOR USING BOOK MANAGEMENT SYSTEM");
		System.out.println("***********************************");
	}

}
