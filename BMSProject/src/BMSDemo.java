import java.util.Scanner;

public class BMSDemo {

	public static void main(String[] args) {
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
					System.out.println("Book added successfully!!");
				case 2 ->
					System.out.println("Book fetched successfully!!");
				case 3 ->
					System.out.println("Book deleted successfully!!");
				case 4 ->
					System.out.println("Book updated successfully!!");
				case 5 ->
					System.out.println("Book listed successfully!!");
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
