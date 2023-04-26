package library2;

public class Loan {
	String receipt;
	java.util.Date date;
	Customer customer;
	Book book;
	java.util.Date borrowDate;
	java.util.Date returnDate;
	boolean isReturned =false;
	
	public void isReturned() {
		 isReturned = true;
	}
	

}
