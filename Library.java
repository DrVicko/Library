package Library;

import java.util.Scanner;

public class Library 
{
	public static Scanner input = new Scanner(System.in); 
	public static void main(String[] args) 
	{
int accNumber, bookNumber, numberIssuedBooks = 0, selection = -1; String accName, bookName; boolean bookIssued = false; 
		
		while (selection != 0)
		{
			System.out.println("\nWelcome to Vedran's public Library management system, please select desired option: "
				+ "\n1. Create new user Account. "
				+ "\n2. Create new Book Account. "
				+ "\n3. Issue Book to registered user."
				+ "\n4. Return issued book from user"
				+ "\n5. Print Account details."
				+ "\n0. Exit \n"); 
			selection  = input.nextInt(); 
			if (selection == 1)
			{
				System.out.println("Enter new user's Account number: "); 
				accNumber = input.nextInt(); 
				while (!AccManager.isCreatedNumber(accNumber))
				{
					System.out.println("You have entered existing Account number, please try again: ");
					accNumber = input.nextInt(); 
				} 
				while (accNumber < 1)
				{
					System.out.println("You have entered negative or zero Account number, pleae try again: ");
					accNumber = input.nextInt(); 
				}
				input.nextLine();
				System.out.println("Enter new user's name: "); accName = input.nextLine(); 
				AccManager.createAccount(accNumber, accName, numberIssuedBooks);
			}
			else if (selection == 2)
			{
				System.out.println("Enter new Book's number: ");
				bookNumber = input.nextInt(); 
				while (!BookManager.isCreatedBookNumber(bookNumber))
				{
					System.out.println("You have entered existing Book nummber, please try again: ");
					bookNumber = input.nextInt(); 
				}
				while (bookNumber < 1)
				{
					System.out.println("You have entered negative or zero Book number, pleae try again: ");
					bookNumber = input.nextInt(); 
				}
				input.nextLine();
				System.out.println("Enter new Book's name: ");
				bookName = input.nextLine(); 
				BookManager.createBook(bookNumber, bookName, bookIssued);
				
			}
			else if (selection == 3)
			{
				System.out.println("\nList of registered books in your Library: ");
				for (int i = 0; i < BookManager.bookList.size(); i++)
				{
					System.out.println(i + " : " + BookManager.bookList.get(i));
				}
				System.out.println("\nPlease choose book to borrow by entering ordinal number in front of book data: ");
				int bookOrdinalNUmber = input.nextInt(); 
				
				System.out.println("\nList of registered users in your Library: ");
				for (int i = 0; i < AccManager.accountList.size(); i++)
				{
					System.out.println(i + " : " + AccManager.accountList.get(i));
				}
				System.out.println("\nPlease choose user you want to borrow book by entering ordinal number in front of user data:");
				int userOrdinalNumber = input.nextInt(); 
				
				BorrowReturn.borrowBook(bookOrdinalNUmber, userOrdinalNumber);
			}
			else if (selection == 4)
			{
				System.out.println("List of issued books:) ");
				BookManager.issuedBooks();
				System.out.println("\nPlease choose book to return by entering ordinal number in front of book data: ");
//				Ovo nisam stigao bas razraditi ali planirano je da ide u klasu BorrowRwturn sa zasebnom metodom vracanja.
			}
			else if (selection == 5)
			{
				System.out.println("\nEnter: \n1. To print data from Users account. \n2. To print data from Book account."
						+ "\n0. To exit. ");
				int accSelection = input.nextInt();
				
					if (accSelection == 1)
					{
						AccManager.printAccount();
					}
					else if (accSelection == 2)
					{
						BookManager.printBook(); 
					}
					else if (accSelection < 0 || accSelection > 2)
					{
						System.out.println("You have entered wrong choice, please try again! ");
						accSelection = input.nextInt();
					}
					else if (accSelection == 0)  break; 
			}
			else if (selection == 0)
			{
				break; 
			}
			else
			{
				System.out.println("You have entered wrong selection, please try again: ");
			    selection = input.nextInt(); 
			}
		}

	}

}
