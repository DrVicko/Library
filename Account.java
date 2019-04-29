package Library;

public class Account 
{
	private int accNumber, numberIssuedBooks; private String customerName; 

	protected Account () { }
	
	Account (int accNumber, String customerName, int numberIssuedBooks)
	{
		this.accNumber = accNumber; 
		this.customerName = customerName; 
		this.numberIssuedBooks = numberIssuedBooks; 
	}

	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public int getNumberIssuedBooks() {
		return numberIssuedBooks;
	}
	public void setNumberIssuedBooks(int numberIssuedBooks) {
		this.numberIssuedBooks = numberIssuedBooks;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Account [accNumber= " + accNumber + ", booksIssued= " + numberIssuedBooks + ", customerName= " + customerName
				+ "]";
	}

}
