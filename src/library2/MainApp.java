package library2;

public class MainApp {
	public static void main(String[] args) {

		Type type1 = new Type();
		type1.type = "Novel";

		Type type2 = new Type();
		type2.type = "Children";

		Type type3 = new Type();
		type3.type = "Fiction";

		Type[] types = { type1, type2, type3 };

		Customer customer1 = new Customer();
		customer1.name = "A";
		customer1.id = 12345;
		customer1.address = "Avenue 1";
		customer1.phoneNo = "12345";

		Customer customer2 = new Customer();
		customer2.name = "B";
		customer2.id = 12333;
		customer2.address = "Avenue 2";
		customer2.phoneNo = "1232222";

		Customer[] customers = { customer1, customer2 };

		Book book1 = new Book();
		book1.name = "A Modern Detective";
		book1.isbn = "111111";
		book1.author = "Edgar Allan Poe";
		book1.stock = 5;
		book1.location = "Floor1";
		book1.type = type1;

		Book book2 = new Book();
		book2.name = "Looking for meaning of life";
		book2.isbn = "22222";
		book2.author = "James Holden";
		book2.stock = 10;
		book2.location = "Floor2";
		book2.type = type2;

		Book[] books = { book1, book2 };

		Loan loan1 = new Loan();
		loan1.receipt = "1a2b3d";
		loan1.date = new java.util.Date();
		loan1.customer = customer1;
		loan1.book = book1;
		loan1.isReturned();

		Loan loan2 = new Loan();
		loan2.receipt = "jsvakbiu";
		loan2.date = new java.util.Date();
		loan2.customer = customer2;
		loan2.book = book2;

		Loan loan3 = new Loan();
		loan3.receipt = "jsvakbiu";
		loan3.date = new java.util.Date();
		loan3.customer = customer1;
		loan3.book = book2;

		Loan[] loans = { loan1, loan2, loan3 };
		System.out.println("Borrowing list: ");
		for (Loan loan : loans) {
			System.out.println(loan.book.name + " is borrowed by customer " + loan.customer.name);

			System.out.println("-------");

		}
		System.out.println("Book status");
		for (Loan loan : loans) {
			if (loan.isReturned) {
				System.out.println("Book: " + loan.book.name + " is not returned by customer " + loan.customer.name);

			} else {
				System.out.println("Book: " + loan.book.name + " is returned by customer " + loan.customer.name);
			}
		}

	}

}
