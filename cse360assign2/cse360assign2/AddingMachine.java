package cse360assign2;

public class AddingMachine {
	
	//Antonio Varela
	//70641
	//assignment2
	//This AddingMachine will create addition and subtraction 
	//calculations and return the total. 
	
	public static void main(String Args[]) {
		
	}
	
	private int total;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	 
	public int getTotal () {
		return total;	
	}
	
	public void add (int value) {
		value = value + total; 
	}
	
	public void subtract (int value) {
		value = total - value; 
	}
		
	public String toString () {
		return "";
	}

	public void clear() {
	
	}
}
