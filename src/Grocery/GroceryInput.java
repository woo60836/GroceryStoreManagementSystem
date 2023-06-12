package Grocery;

import java.util.Scanner;

import exception.CountryFormatException;

public interface GroceryInput {
	
	public int getProductno();
	
	public void setName(String name);
	
	public String getName();
	
	public int getPrice();
	
	public String getCountry();
	
	public void setDiscount(int discount);
	
	public void setPrice(int price);
	
	public void setCountry(String country) throws CountryFormatException;
	
	public void setProductno(int productno);
	
	public void getUserInput(Scanner input);
	
	public void printinfo();
}