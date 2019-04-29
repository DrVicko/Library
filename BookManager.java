package Library;

import java.util.ArrayList;

public class BookManager 
{
protected static ArrayList<Book> bookList = new ArrayList <>(); 
	
	protected static void createBook (int bookNumber, String bookName, boolean bookIssued)
	{
		Book book = new Book (bookNumber, bookName, bookIssued);  
		bookList.add(book); 
	}
	
	protected static void printBook ()
	{
		System.out.println("Book data is: ");
		for (Book x: bookList)
		{
			System.out.println(x + "\n");
		}
	}
	
	protected static boolean isCreatedBookNumber (int bookNumber)
	{
		for (int i = 0; i < bookList.size(); i++)
		{
			if (bookList.get(i).getBookNumber() == bookNumber) 
				return false;
		}
		return true; 
	}
	
	protected static void issuedBooks ()
	{
		for (int i = 0; i < bookList.size(); i++)
		{
			if (bookList.get(i).isBookIssued() == true)
			{
				System.out.println(i + " : " + bookList.get(i));
			}
		}
	}

}
