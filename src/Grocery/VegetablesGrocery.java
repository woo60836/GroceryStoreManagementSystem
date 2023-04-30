package Grocery;

import java.util.Scanner;

public class VegetablesGrocery extends Grocery {
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
}
