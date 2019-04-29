package Library;

import java.util.ArrayList;

public class AccManager 
{
protected static ArrayList <Account> accountList = new ArrayList <>(); 
	
	protected static void createAccount (int number, String name, int numberIssuedBooks)
	{
		Account acc = new Account (number, name, numberIssuedBooks); 
		accountList.add(acc); 
	}
	
	protected static void printAccount ()
	{
		System.out.println("Account data is: ");
		for (Account x : accountList)  
		{
			System.out.println(x + "\n");
		}
	}
	protected static boolean isCreatedNumber (int number)
	{
		for (int i = 0; i < accountList.size(); i++)
		{
			if (accountList.get(i).getAccNumber() == number)
				return false;
		}
		return true;
	}

}
