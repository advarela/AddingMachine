package cse360assign2;

public class AddingMachine {
	
	//Antonio Varela
	//Class id: 70641
	//assignment2
	//This AddingMachine will create addition and subtraction 
	//calculations and return the total. 
	
	public static void main(String[] args) {
		System.out.println(getTotal());
		
		add(4);
		
		System.out.println(getTotal());
		
		subtract(2);
		
		System.out.println(getTotal());
		
		add(5);
		
		System.out.println(getTotal());
		
		System.out.println(showTransactionHistory());
		
		clear();
		
		System.out.println(getTotal());
		
	}
	
	private static int total;
	
	//This will record each transaction
	private static String transactionHistory;
	
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
		
		transactionHistory = "0";
	}
	 
	public static int getTotal () 
	{
		return total;	
	}
	
	public static void add (int value) 
	{
		
		total = total + value;
		
		transactionHistory = transactionHistory + " + " + value;
	}
	
	public static void subtract (int value) 
	{
		total = total - value; 
		
		transactionHistory = transactionHistory  + " - " + value;
	}
		
	//prints the transactions performed
	public static String showTransactionHistory () 
	{
		return transactionHistory;
	}

	//resets the variables to its initial state
	public static void clear() 
	{
		total = 0;
		transactionHistory = "0";
	}
}
