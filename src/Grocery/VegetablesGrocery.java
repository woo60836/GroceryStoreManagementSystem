package Grocery;

import java.util.Scanner;

import exception.CountryFormatException;

public class VegetablesGrocery extends Grocery implements GroceryInput {
	
	public VegetablesGrocery(GroceryKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {

		System.out.print("Food Name : ");
		String name = input.next();
		this.setName(name);
		
		char answer2 = 'x';
		while (answer2 != 'y' && answer2 != 'Y' && answer2 != 'n' && answer2 !='N') {
			System.out.print("Is there a discount on this item? (Y/N) : ");
			answer2 = input.next().charAt(0);
			if(answer2 == 'y'||answer2 == 'Y') {
				System.out.print("discount rate : ");
				int discount = input.nextInt();
				this.setDiscount(discount);
				break;
			}
			else if (answer2 == 'n'|| answer2 == 'N') {
				this.setDiscount(0);
				break;
			}
			else {	
			}
		}
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer !='N') {
			System.out.print("Does it have an expiration date? (Y/N) : ");
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

		System.out.print("Price : ");
		int price = input.nextInt();
		this.setPrice(price);

		System.out.print("Country of Origin : ");
		String country = input.next();
		try {
			this.setCountry(country);
		} catch (CountryFormatException e) {
			System.out.println("Incorrect Country Format. Put the country that contains '->'.");
			e.printStackTrace();
		}

		System.out.print("Product No : ");
		int productno = input.nextInt();
		this.setProductno(productno);
	}
	
	public void printinfo() {
		String skind = "none";
		switch(this.kind) {
		case Fruits:
			skind = "Fruits";
			break;
		case Vegetables:
			skind = "Vegetables";
			break;
		case Snacks:
			skind = "Snacks";
			break;
		case Beers:
			skind = "Beers";
			break;
		default:			
		}
		int discountedprice = (int)(price - price * (discount / 100.0));
		System.out.println("kind : "+ skind +" // name : " + name +" // discount : " + discount+"%" + " // price : " +  discountedprice + " // country : " + country + " // number : " + productno+ " // appropriate consumption date : " + edate);
	}
}