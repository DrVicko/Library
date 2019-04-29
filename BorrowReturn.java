package Library;

public class BorrowReturn 
{
	public static void borrowBook (int bookOrdinalNumber, int userOrdinalNUmber)
	{
		while (bookOrdinalNumber >= 0 && userOrdinalNUmber >= 0)
		{
			boolean issued = BookManager.bookList.get(bookOrdinalNumber).isBookIssued(); 
			int booksIssued = AccManager.accountList.get(userOrdinalNUmber).getNumberIssuedBooks();
		
			if (booksIssued > 2 )
			{
				System.out.println("This user has already 3 book issued on his name, he's not allowed to tako more books!");
				break;
			}
			else if (issued == true)
			{
				System.out.println("Sorry the book is already issued to another user. ");
				break; 
			}
			else if (issued == false)
			{
				BookManager.bookList.get(bookOrdinalNumber).setBookIssued(true);
				booksIssued++;
				AccManager.accountList.get(userOrdinalNUmber).setNumberIssuedBooks(booksIssued);
				java.util.Date date = new java.util.Date (); 
				System.out.println("\nThe book " +BookManager.bookList.get(bookOrdinalNumber).getBookName() + 
					" is isued to " +AccManager.accountList.get(userOrdinalNUmber).getCustomerName() + " on : " + date.toString()); 
				break;
			}
			break;
		}
		
		
	}

}
