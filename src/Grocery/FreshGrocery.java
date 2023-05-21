package Grocery;

import java.util.Scanner;

public class FreshGrocery extends Grocery {
	
	public FreshGrocery(GroceryKind kind) {
		super(kind);
	}

	@Override
	public void getUserInput(Scanner input) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printinfo() {
		String skind = getKindString();
		int discountedprice = (int)(price - price * (discount / 100.0));
		System.out.println("kind : "+ skind +" // name : " + name + " // discount : " + discount+"%" + " // price : " + discountedprice + " // country : " + country + " // number : " + productno+ " // expiration date : " + edate);
	}
	
	public void setGroceryDatewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer !='N') {
			System.out.print("Does it have an expiration date? (Y/N) :");
			answer = input.next().charAt(0);
			if(answer == 'y'||answer == 'Y') {
				System.out.print("expiration date : ");
				String edate = input.next();
				this.setEdate(edate);
				break;
			}
			else if (answer == 'n'|| answer == 'N') {
				this.setEdate("X");
				break;
			}
			else {
			}
		}
	}
}