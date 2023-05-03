package Grocery;

import java.util.Scanner;

public class FruitsGrocery extends Grocery{
	
	public FruitsGrocery(GroceryKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Food Type : ");
		String type = input.next();
		this.setType(type);

		System.out.print("Food Name : ");
		String name = input.next();
		this.setName(name);

		System.out.print("Price : ");
		int price = input.nextInt();
		this.setPrice(price);

		System.out.print("Country of Origin : ");
		String country = input.next();
		this.setCountry(country);

		System.out.print("Product No : ");
		int productno = input.nextInt();
		this.setProductno(productno);
	}
	
	public void printinfo() {
		String skind = "none";
		System.out.println("kind:" + skind + "type:" + type + " // name:" + name + " // price:" + price + " // country:" + country + " // number:" + productno);
		switch (this.kind) {
		case Fruits:
			skind = "Fruits";
			break;
		case Vegetables:
			skind = "Vegetables";
			break;
		case Seafoods:
			skind = "Seafoods";
			break;
		case Beers:
			skind = "Beers";
			break;
		default:
		}
	}
}
