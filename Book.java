package Library;

public class Book 
{
	private int bookNumber; 
	private String bookName;
	private boolean bookIssued; 
	
	protected Book () {}
	
	Book (int bookNumber, String bookName, boolean bookIssued)
	{
		this.bookNumber = bookNumber; 
		this.bookName = bookName;
		this.bookIssued = bookIssued; 
	}

	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public boolean isBookIssued() {
		return bookIssued;
	}
	public void setBookIssued(boolean bookIssued) {
		this.bookIssued = bookIssued;
	}

	@Override
	public String toString() {
		return "Book [bookNumber= " + bookNumber + ", bookName= " + bookName + ", bookIssued= " + bookIssued + "]";
	}

}
