package Grocery;

import java.util.Scanner;

public abstract class Grocery {

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

	public void setCountry(String country) {
		this.country = country;
	}

	public int getProductno() {
		return productno;
	}

	public void setProductno(int productno) {
		this.productno = productno;
	}

	
	public abstract void printinfo(); 
}