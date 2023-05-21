package Grocery;

import java.util.Scanner;

public class FruitsGrocery extends FreshGrocery {
	
	public FruitsGrocery(GroceryKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setGroceryName(input);
		setGroceryDiscountwithYN(input);	
		setGroceryDatewithYN(input);
		setGroceryPrice(input);
		setGroceryCountry(input);
		setGroceryProductno(input);
	}
	
	public void setGroceryDiscountwithYN(Scanner input) {
		char answer2 = 'x';
		while (answer2 != 'y' && answer2 != 'Y' && answer2 != 'n' && answer2 !='N') {
			System.out.print("Is there a discount on this item? (Y/N) : ");
			answer2 = input.next().charAt(0);
			if(answer2 == 'y'||answer2 == 'Y') {
				setGroceryDiscount(input);
				break;
			}
			else if (answer2 == 'n'|| answer2 == 'N') {
				this.setDiscount(0);
				break;
			}
			else {		
			}
		}
	}
}