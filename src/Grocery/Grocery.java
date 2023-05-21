package Grocery;

import java.util.Scanner;

import exception.CountryFormatException;

public abstract class Grocery implements GroceryInput {

	protected GroceryKind kind = GroceryKind.Fruits;
	protected int discount;
	protected String name;
	protected int price;
	protected String country;
	protected int productno;
	protected String edate;

	public Grocery() {
	}

	public Grocery(GroceryKind kind, int discount, String name, int price, String country, int productno, String edate) {
		super();
		this.kind = kind;
		this.discount = discount;
		this.name = name;
		this.price = price;
		this.country = country;
		this.productno = productno;
		this.edate = edate;
		
	}
	
	public String getEdate() {
		return edate;
	}
	
	public void setEdate(String edate) {
		this.edate = edate;
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

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
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

	public void setCountry(String country) throws CountryFormatException {
		if (!country.contains("F") && !country.equals("")) {
			throw new CountryFormatException();
		}
		this.country = country;
	}

	public int getProductno() {
		return productno;
	}

	public void setProductno(int productno) {
		this.productno = productno;
	}

	
public abstract void printinfo(); 
	
	public void setGroceryName(Scanner input) {
		System.out.print("Food Name : ");
		String name = input.next();	
		this.setName(name);
	}
	
	public void setGroceryDiscount(Scanner input) {
		System.out.print("Discount rate : ");
		int discount = input.nextInt();
		this.setDiscount(discount);
	}
	
	public void setGroceryPrice(Scanner input) {
		System.out.print("Price : ");
		int price = input.nextInt();
		this.setPrice(price);
	}
	
	public void setGroceryCountry(Scanner input) {
		String country = "";
		while (!country.contains("F")) {
			System.out.print("Country of Origin : ");
			country = input.next();
			try {
				this.setCountry(country);
			} catch (CountryFormatException e) {
				System.out.println("Incorrect Country Format. Put the country that contains 'From'.");
			}
		}
	}
	
	public void setGroceryProductno(Scanner input) {
		System.out.print("Product No : ");
		int productno = input.nextInt();
		this.setProductno(productno);
	}
	
	public String getKindString() {
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
		return skind;
	}
}