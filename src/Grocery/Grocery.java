package Grocery;

import java.util.Scanner;

public class Grocery {

	protected GroceryKind kind = GroceryKind.Fruits;
	protected String type;
	protected String name;
	protected int price;
	protected String country;
	protected int productno;

	public Grocery() {
	}

	public Grocery(GroceryKind kind, String type, String name, int price, String country, int productno) {
		super();
		this.kind = kind;
		this.type = type;
		this.name = name;
		this.price = price;
		this.country = country;
		this.productno = productno;
	}
	
	public Grocery(GroceryKind kind) {
		this.kind = kind;
	}

	public GroceryKind getKind() {
		return kind;
	}

	public void setKind(GroceryKind kind) {
		this.kind = kind;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getProductno() {
		return productno;
	}

	public void setProductno(int productno) {
		this.productno = productno;
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